import java.util.Objects;

public class NoteBook {
    private static int count = 1;
    private final int ID = count++;

    private final String MANUFACTURER;
    private final String SIZE;
    private final String OS;
    private final String RAM;
    private final String HDD;
    private final String COLOR;

    public NoteBook(String manufacturer, String size, String OS,
                    String RAM, String HDD, String COLOR) {
        this.MANUFACTURER = manufacturer;
        this.SIZE = size;
        this.OS = OS;
        this.RAM = RAM;
        this.HDD = HDD;
        this.COLOR = COLOR;
    }

    public String getManufacturer() {
        return MANUFACTURER;
    }

    public String getSize() {
        return SIZE;
    }

    public String getOs() {
        return OS;
    }

    public String getRam() {
        return RAM;
    }

    public String getHdd() {
        return HDD;
    }

    public String getColor() {
        return COLOR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return Objects.equals(RAM, noteBook.RAM)
                && Objects.equals(HDD, noteBook.HDD)
                && Objects.equals(MANUFACTURER, noteBook.MANUFACTURER)
                && Objects.equals(SIZE, noteBook.SIZE)
                && Objects.equals(OS, noteBook.OS)
                && Objects.equals(COLOR, noteBook.COLOR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MANUFACTURER, SIZE, OS, RAM, HDD, COLOR);
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "ID=" + ID +
                ", manufacturer='" + MANUFACTURER + '\'' +
                ", size='" + SIZE + '\'' +
                ", OS='" + OS + '\'' +
                ", RAM=" + RAM +
                ", HDD=" + HDD +
                ", color='" + COLOR + '\'' +
                '}';
    }
}
