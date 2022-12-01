import java.util.ArrayList;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> taskList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i <= 10; i++){
            taskList.add(rand.nextInt(50));
        }
        System.out.println("Заданный целочисленный массив");
        System.out.println(taskList.toString());
        int min = taskList.get(0);
        int max = taskList.get(0);
        int sum = taskList.get(0);
        for (int j = 1; j < taskList.size(); j++){
            if (taskList.get(j) > max){
                max = taskList.get(j);
            }
            if (taskList.get(j) < min){
                min = taskList.get(j);
            }
            sum += taskList.get(j);
        }
        int midRes = sum / taskList.size();
        System.out.printf("Максимальное значение - %d, минимальное значение - %d, среднее - %d", max, min, midRes);
    }
}
