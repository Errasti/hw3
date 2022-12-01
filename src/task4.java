import java.util.ArrayList;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        List<ArrayList<String>> taskList = new ArrayList<>();
        ArrayList<String> genreFantasy = new ArrayList<>();
        ArrayList<String> genreDetective = new ArrayList<>();
        ArrayList<String> genreRomance = new ArrayList<>();
        ArrayList<String> genrePsychology = new ArrayList<>();
        genreFantasy.add("Фантастика    ");
        genreFantasy.add("Пустой трон   ");
        genreFantasy.add("Врата         ");
        genreFantasy.add("Доктор шифр   ");
        taskList.add(genreFantasy);
        genreDetective.add("Детективы   ");
        genreDetective.add("Воскрешенный");
        genreDetective.add("Львы        ");
        genreDetective.add("Крысиный    ");
        taskList.add(genreDetective);
        genreRomance.add("Романы        ");
        genreRomance.add("Дикость       ");
        genreRomance.add("Искушение     ");
        genreRomance.add("Герой поневоле");
        taskList.add(genreRomance);
        genrePsychology.add("Психология ");
        genrePsychology.add("Критерий   ");
        genrePsychology.add("Характер   ");
        genrePsychology.add("Шаг вперед ");
        taskList.add(genrePsychology);
        bookSort(taskList);
    }
    public static void bookSort(List<ArrayList<String>> lst){
        for(int i = 0; i < lst.size(); i++){
            System.out.println();
            for (ArrayList<String> strings : lst) {
                System.out.print(strings.get(i) + "\t\t\t\t");
            }
        }
    }
}
