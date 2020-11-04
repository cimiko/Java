package go.g2academy.ArrayDay7;

public class ArrayInitalization {
    private String[] names;
    private MyDate[] dates;

    String[] simpleNames = {
            "Georgianna",
            "Jen",
            "Simon"
    };

    MyDate[] simpleDates = {
            new MyDate(22, 7, 1964),
            new MyDate(1, 1, 2000),
            new MyDate(22, 12, 1964)
    };

    public ArrayInitalization(){
        names = new String[3];
        names[0] = "Georgianna";
        names[1] = "Jen";
        names[2] = "Simon";

        dates = new MyDate[3];
        dates[0] = new MyDate(22, 7, 1964);
        dates[1] = new MyDate(1, 1, 2000);
        dates[2] = new MyDate(22, 12, 1964);
    }

    public String[] getNames() {
        return names;
    }

    public String[] getSimpleNames() {
        return simpleNames;
    }

    public MyDate[] getDates() {
        return dates;
    }

    public MyDate[] getSimpleDates() {
        return simpleDates;
    }
}
