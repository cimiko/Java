public class Car {
    // Attribute_declaration
    String merek;
    String warna;
    int gigi = 0;
    int kecepatan = 0;

    // public Car(){
    //     merek = "BMW";
    //     warna = "Red";
    // }

    // Modifier_declaration
    void changeMerek(String newValue){
        merek = newValue;
    }

    void changeWarna(String newValue){
        warna = newValue;
    }

    void changeGigi(int newValue){
        gigi = newValue;
    }

    void kecepatanUp(int increment){
        kecepatan = kecepatan + increment;
    }

    void applyBrakes(int decrement){
        kecepatan = kecepatan - decrement;
    }

    void printStates(){
        System.out.println("\nMerek-Mobil:" +
            merek + " Warna-Mobil:" +
            warna + " Gigi:" + gigi +
            " Kecepatan:" + kecepatan);
    }

    void print(){
        System.out.println("Mobil " + merek +
        " berwarna " + warna +
        ", melaju dengan kecepatan " + kecepatan + 
        " menggunakan gigi " + gigi);
    }
}