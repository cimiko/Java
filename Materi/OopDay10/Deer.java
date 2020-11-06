package go.g2academy.OopDay10;

public class Deer extends Animal implements Vegetarian{
    public static void main(String[] args) {

        Deer d = new Deer();
        Animal a = d;
        Vegetarian v = d;
        Object o = d;

//        Deer d = new Deer();
//        Animal a = new Deer();
//        Vegetarian v = new Deer();
//        Object o = new Deer();

    }
}
