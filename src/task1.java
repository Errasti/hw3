import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] unsortedArr = new int[] {34, 12, 56, 8, 90, 1, 3, 7};
        mergeSort(unsortedArr, 0, unsortedArr.length - 1);
        System.out.println(Arrays.toString(unsortedArr));

    }
    private static void mergeSort(int[] arr, int firstInd, int lastInd) {

        if (lastInd <= firstInd)
            return;
        int mid = firstInd + (lastInd - firstInd) / 2;
        mergeSort(arr, firstInd, mid);
        mergeSort(arr, mid + 1, lastInd);

        int[] temp = Arrays.copyOf(arr, arr.length);

        for (int k = firstInd; k <= lastInd; k++)
            temp[k] = arr[k];

        int i = firstInd, j = mid + 1;
        for (int k = firstInd; k <= lastInd; k++) {

            if (i > mid) {
                arr[k] = temp[j];
                j++;
            } else if (j > lastInd) {
                arr[k] = temp[i];
                i++;
            } else if (temp[j] < temp[i]) {
                arr[k] = temp[j];
                j++;
            } else {
                arr[k] = temp[i];
                i++;
            }
        }
    }
}
