package go.g2academy.InterfacesDay13;

public class MammalInt implements IAnimal {

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String[] args) {
        MammalInt mammal = new MammalInt();
        mammal.eat();
        mammal.travel();
    }
}
