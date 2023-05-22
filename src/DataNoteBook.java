import java.util.ArrayList;
import java.util.List;

public class DataNoteBook {
    private final ArrayList<String> RAM = new ArrayList<>(
            List.of("4 Gb", "8 Gb", "16 Gb", "32 Gb"));
    private final ArrayList<String> OS = new ArrayList<>(
            List.of("Windows 10", "Windows 11", "MacOS", "Windows 11 Pro"));
    private final ArrayList<String> COLOR = new ArrayList<>(
            List.of("green", "red", "black", "blue"));
    private final ArrayList<String> HDD = new ArrayList<>(
            List.of("128 Gb", "256 Gb", "521 Gb", "1000 Gb"));
    private final ArrayList<String> MANUFACTURE = new ArrayList<>(
            List.of("Lenovo", "Acer", "Asus", "Apple"));

    private final ArrayList<String> SIZE_NOTEBOOK = new ArrayList<>(
            List.of("14\"", "15\"", "16\"", "17\""));

    public final ArrayList<String> getRAM() {
        return RAM;
    }

    public ArrayList<String> getOS() {
        return OS;
    }

    public ArrayList<String> getCOLOR() {
        return COLOR;
    }

    public ArrayList<String> getHDD() {
        return HDD;
    }

    public ArrayList<String> getMANUFACTURE() {
        return MANUFACTURE;
    }

    public ArrayList<String> getSIZE_NOTEBOOK() {
        return SIZE_NOTEBOOK;
    }

    public int sizeList() {
        return RAM.size();
    }
}
