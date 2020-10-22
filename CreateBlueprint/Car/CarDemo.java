public class CarDemo {
    public static void main(String[] args) {
        
        // Car objects
        Car car1 = new Car();
        Car car2 = new Car(); 

        // Invoke methods on
        // those objects
        car1.changeMerek("Volvo");
        car1.changeWarna("Red");
        car1.changeGigi(1);
        car1.kecepatanUp(10);
        car1.printStates();
        car1.print();
        
        car2.changeMerek("BMW");
        car2.changeWarna("Silver");
        car2.changeGigi(3);
        car2.kecepatanUp(10);
        car2.applyBrakes(5);
        car2.kecepatanUp(60);
        car2.printStates();
        car2.print();
    }
}