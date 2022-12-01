import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        List<Integer> randList =  new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 11; i++){
            randList.add(random.nextInt(50));
        }
        System.out.println("Изначальный список");
        System.out.println(Arrays.toString(randList.toArray()));
        for(int j = 0; j < randList.size(); j++){
            if (randList.get(j) % 2 != 0){
                resultList.add(randList.get(j));
            }
        }
        System.out.println("Конечный список");
        System.out.println(Arrays.toString(resultList.toArray()));
    }
}
