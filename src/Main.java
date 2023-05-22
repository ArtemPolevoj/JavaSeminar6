import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int countNotebook = 50;
        DataNoteBook dataNoteBook = new DataNoteBook();
        GeneratorNoteBook generatorNoteBook = new GeneratorNoteBook(dataNoteBook, countNotebook);
        Parameter parameter = new Parameter(dataNoteBook);
        OfferNotebook offerNotebook = new OfferNotebook(parameter,generatorNoteBook);
        ArrayList<NoteBook> userNotebook = offerNotebook.getListNotebook();
        System.out.println("Вывод подходящих ноутбуков:");
        if (userNotebook.size() > 0){
            userNotebook.forEach(System.out::println);
        } else {
            System.out.println("Нет подходящих ноутбуков.");
        }
    }
}
