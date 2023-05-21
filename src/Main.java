import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        GeneratorNoteBook generatorNoteBook = new GeneratorNoteBook();
        HashSet<NoteBook> setNotebook = generatorNoteBook.geSetNotebook(10);

        for (NoteBook n: setNotebook) {
            if (n.getColor().equals("black")){
                System.err.println(n);
            }
        }
    }
}
