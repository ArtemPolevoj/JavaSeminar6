import java.util.ArrayList;
import java.util.Scanner;

public class Parameter {

    private final DataNoteBook DATA_NOTEBOOK = new DataNoteBook();
    private ArrayList<String> listParameter;
    private String value;
private int parameterNumber;
    public void getParameter() {
        String selectionParameter = "Выберете параметр: " +
                "1 - RAM, " +
                "2 - OS, " +
                "3 - COLOR, " +
                "4 - HDD, " +
                "5 - MANUFACTURE, " +
                "6 - SIZE_NOTEBOOK.";
        String selectionValue = "";
        System.out.println("Добрый день");

        parameterNumber = getNumber(selectionParameter, 6);
        switch (parameterNumber) {
            case 1 -> {
                listParameter = DATA_NOTEBOOK.getRAM();
                selectionValue = "минимальное значение RAM";
            }
            case 2 -> {
                listParameter = DATA_NOTEBOOK.getOS();
                selectionValue = "OS";
            }
            case 3 -> {
                listParameter = DATA_NOTEBOOK.getCOLOR();
                selectionValue = "COLOR";
            }
            case 4 -> {
                listParameter = DATA_NOTEBOOK.getHDD();
                selectionValue = "минимальное значение HDD";
            }
            case 5 -> {
                listParameter = DATA_NOTEBOOK.getMANUFACTURE();
                selectionValue = "MANUFACTURE";
            }
            case 6 -> {
                listParameter = DATA_NOTEBOOK.getSIZE_NOTEBOOK();
                selectionValue = "SIZE_NOTEBOOK";
            }
        }
        String selectionMinValue = "Выберете "+ selectionValue + ": " +
                "1 - " + listParameter.get(0) + ", " +
                "2 - " + listParameter.get(1) + ", " +
                "3 - " + listParameter.get(2) + ", " +
                "4 - " + listParameter.get(3) + ".";
        int minValue = getNumber(selectionMinValue, 4);
        switch (minValue) {
            case 1 -> value = listParameter.get(0);
            case 2 -> value = listParameter.get(1);
            case 3 -> value = listParameter.get(2);
            case 4 -> value = listParameter.get(3);
        }
    }

    private int getNumber(String str, int max) {
        int number;
        System.out.println(str);
        try {
            Scanner scan = new Scanner(System.in);
            number = scan.nextInt();
            if (number <= 0 || number > max) {
                System.out.println("Не верное значение");
                return getNumber(str, max);
            } else {
                return number;
            }
        } catch (Exception e) {
            System.out.println("Не верное значение");
            return getNumber(str, max);
        }
    }

    public String getValue() {
        return value;
    }
    public int getParameterNumber(){
        return parameterNumber;
    }
}
