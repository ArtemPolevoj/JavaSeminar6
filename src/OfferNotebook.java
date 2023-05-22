import java.util.ArrayList;
import java.util.HashMap;

public class OfferNotebook {
    private final Parameter PARAMETER;
    private final GeneratorNoteBook GENERATOR_NOTEBOOK;
    private final ArrayList<NoteBook> LIST_NOTEBOOK = new ArrayList<>();

    public OfferNotebook(Parameter parameter, GeneratorNoteBook generatorNoteBook) {
        this.PARAMETER = parameter;
        this.GENERATOR_NOTEBOOK = generatorNoteBook;
        setListNotebook();
    }

    public ArrayList<NoteBook> getListNotebook() {
        return LIST_NOTEBOOK;
    }

    private void setListNotebook() {
        HashMap<Integer, String> mapParameter = PARAMETER.getHashMapParameter();
        int key = 0;
        String value = "";
        for (Integer i : mapParameter.keySet()) {
            key = i;
        }
        for (String s : mapParameter.values()) {
            value = s;
        }
        switch (key) {
            case 1 -> getRam(value);
            case 2 -> getOs(value);
            case 3 -> getColor(value);
            case 4 -> getHdd(value);
            case 5 -> getManufacturer(value);
            case 6 -> getSizeNotebook(value);
        }
    }

    private void getRam(String ram) {
        int r;
        int v = getInt(ram);
        for (NoteBook n : GENERATOR_NOTEBOOK.getHashSetNotebook()) {
            r = getInt(n.getRam());
            if (r >= v) LIST_NOTEBOOK.add(n);
        }
    }

    private void getOs(String os) {
        for (NoteBook n : GENERATOR_NOTEBOOK.getHashSetNotebook()) {
            if (n.getOs().equals(os)) LIST_NOTEBOOK.add(n);
        }
    }

    private void getColor(String color) {
        for (NoteBook n : GENERATOR_NOTEBOOK.getHashSetNotebook()) {
            if (n.getColor().equals(color)) LIST_NOTEBOOK.add(n);
        }
    }

    private void getHdd(String hdd) {
        int h;
        int v = getInt(hdd);
        for (NoteBook n : GENERATOR_NOTEBOOK.getHashSetNotebook()) {
            h = getInt(n.getHdd());
            if (h >= v) LIST_NOTEBOOK.add(n);
        }
    }

    private void getManufacturer(String manufacturer) {
        for (NoteBook n : GENERATOR_NOTEBOOK.getHashSetNotebook()) {
            if (n.getManufacturer().equals(manufacturer)) LIST_NOTEBOOK.add(n);
        }
    }

    private void getSizeNotebook(String sizeNotebook) {
        for (NoteBook n : GENERATOR_NOTEBOOK.getHashSetNotebook()) {
            if (n.getSize().compareTo(sizeNotebook) >= 0) LIST_NOTEBOOK.add(n);
        }
    }

    private int getInt(String value) {
        int index = value.indexOf(" ");
        String temp = value.substring(0, index);
        return Integer.parseInt(temp);
    }
}
