import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratorNoteBook {
    private int count;
    private final HashSet<NoteBook> setNotebook = new HashSet<>();
    private HashMap<String, ArrayList<NoteBook>> mapNotebook = new HashMap<>();
    private final DataNoteBook dataNoteBook = new DataNoteBook();

    private final int SIZE = dataNoteBook.size();

    public HashSet<NoteBook> geSetNotebook(int count) {
        this.count = count;
        generator();
        return setNotebook;
    }
    public HashMap<String, ArrayList<NoteBook>> getMapNotebook(int count){
        this.count = count;
        generator();
        return mapNotebook;
    }

    private void generator() {
        for (int i = 1; i <= count; i++) {
            String manufacturer = manufacturerRandom();
            String size = sizeRandom();
            String os = osRandom();
            String ram = ramRandom();
            String hdd = hddRandom();
            String color = colorRandom();
            NoteBook noteBook = new NoteBook(manufacturer, size, os, ram,
                    hdd, color);
            setNotebook.add(noteBook);




        }

    }

    private String manufacturerRandom() {
        ArrayList<String> manufacturerList = dataNoteBook.getMANUFACTURE();
        int index = (int) (Math.random() * SIZE);
        return manufacturerList.get(index);
    }

    private String colorRandom() {
        ArrayList<String> manufacturerList = dataNoteBook.getCOLOR();
        int index = (int) (Math.random() * SIZE);
        return manufacturerList.get(index);
    }

    private String sizeRandom() {
        ArrayList<String> manufacturerList = dataNoteBook.getSIZE_NOTEBOOK();
        int index = (int) (Math.random() * SIZE);
        return manufacturerList.get(index);
    }

    private String osRandom() {
        ArrayList<String> manufacturerList = dataNoteBook.getOS();
        int index = (int) (Math.random() * SIZE);
        return manufacturerList.get(index);
    }

    private String ramRandom() {
        ArrayList<String> manufacturerList = dataNoteBook.getRAM();
        int index = (int) (Math.random() * SIZE);
        return manufacturerList.get(index);
    }

    private String hddRandom() {
        ArrayList<String> manufacturerList = dataNoteBook.getHDD();
        int index = (int) (Math.random() * SIZE);
        return manufacturerList.get(index);
    }

}
