import java.util.Objects;

public class NoteBook {
    private static int count = 1;
    private final  int ID = count++;

    private String manufacturer;
    private String size;
    private String os;
    private String ram;
    private String hdd;
    private String color;

    public NoteBook() {

    }

    public NoteBook(String manufacturer, String size, String os,
                    String ram, String hdd, String color) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;
    }

    public int getID() {
        return ID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSize() {
        return size;
    }

    public String getOs() {
        return os;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getColor() {
        return color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return Objects.equals(ram, noteBook.ram)
                && Objects.equals(hdd, noteBook.hdd)
                && Objects.equals(manufacturer, noteBook.manufacturer)
                && Objects.equals(size, noteBook.size)
                && Objects.equals(os, noteBook.os)
                && Objects.equals(color, noteBook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, size, os, ram, hdd, color);
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "ID=" + ID +
                ", manufacturer='" + manufacturer + '\'' +
                ", size='" + size + '\'' +
                ", OS='" + os + '\'' +
                ", RAM=" + ram +
                ", HDD=" + hdd +
                ", color='" + color + '\'' +
                '}';
    }
}
