import java.util.ArrayList;

import java.util.HashSet;


public class GeneratorNoteBook {
    private int count;
    private final HashSet<NoteBook> setNotebook = new HashSet<>();
    private final DataNoteBook dataNoteBook;

    public GeneratorNoteBook(DataNoteBook dataNoteBook, int count) {
        this.dataNoteBook = dataNoteBook;
        setCount(count);
        generator();
    }

    private void setCount(int count) {
        if (count > 0) {
            this.count = count;
        } else {
            System.out.println("Количество не может быть меньше нуля.");
            System.exit(1);
        }
    }

    public HashSet<NoteBook> getHashSetNotebook() {
        return setNotebook;
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
        int index = (int) (Math.random() * dataNoteBook.sizeList());
        return manufacturerList.get(index);
    }

    private String colorRandom() {
        ArrayList<String> manufacturerList = dataNoteBook.getCOLOR();
        int index = (int) (Math.random() * dataNoteBook.sizeList());
        return manufacturerList.get(index);
    }

    private String sizeRandom() {
        ArrayList<String> manufacturerList = dataNoteBook.getSIZE_NOTEBOOK();
        int index = (int) (Math.random() * dataNoteBook.sizeList());
        return manufacturerList.get(index);
    }

    private String osRandom() {
        ArrayList<String> manufacturerList = dataNoteBook.getOS();
        int index = (int) (Math.random() * dataNoteBook.sizeList());
        return manufacturerList.get(index);
    }

    private String ramRandom() {
        ArrayList<String> manufacturerList = dataNoteBook.getRAM();
        int index = (int) (Math.random() * dataNoteBook.sizeList());
        return manufacturerList.get(index);
    }

    private String hddRandom() {
        ArrayList<String> manufacturerList = dataNoteBook.getHDD();
        int index = (int) (Math.random() * dataNoteBook.sizeList());
        return manufacturerList.get(index);
    }

}
