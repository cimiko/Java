package go.g2academy.OopDay10;

public class SubClass extends SuperClass{
    int num = 10;

    // display method of subclass
    public void  diplay(){
        System.out.println("This is the display method of subclass");
    }

    public void myMethod(){

        this.diplay();

        super.display();
        System.out.println("Value of the variable named num in super class: " + super.num);
        System.out.println("Value of the variable named num in subclass: " + this.num);

    }

    public static void main(String[] args) {
        // anonymous object
        new SubClass().myMethod();
    }
}
