package go.g2academy.Day6;

public class ThisExample {
    //Instance variable num
    int num = 10;

    // Constuctor adalah method yang istimewa, yang diwajibkan namanya sama dengan nama class
    ThisExample(){
        System.out.println("This is an example program on keyword this");
    }

    ThisExample(int num){
        //Invoking the default constructor
        // memanggil this constuctor hanya bisa dilakukan 1x
        this();

        //Assigning the local variable num to the instance variable num
        this.num = num;
    }

    public void greet() {
        System.out.println("Hi Welcome to JAVA");
    }

    public void print() {
        // Local Variable num
        int num = 20;

        // Printing the local variable
        System.out.println("Value of local variable num is : " + num);

        // Printing the instance variable
        System.out.println("Value of instance variable num is : " + this.num);

        // Invoking the greet method of a class
        this.greet();
    }

    public static void main(String[] args) {
        // Instantiating the class
        ThisExample obj1 = new ThisExample();

        // Invoking the print method
        obj1.print();

        // Passing a new value to the num variable through parametrized constructor
        ThisExample obj2 = new ThisExample(30);

        // Invoking the print method Again
        obj2.print();
    }
}
