//
// Sample "Hello World" application
//
public class TestGreeting{
    public static String staticGreeting;

 	public static void main (String[] args) {
        // Greeting hello = new Greeting();
        // hello.Name = "CiMiKo";
        // hello.greet();
        // hello.greet();
        // hello.Name = "Jishu";
        // hello.greet();
         
        Greeting Hartono = new Greeting();
        Hartono.Name = "Hartono";
        Hartono.greet();

        Greeting Ifnu = new Greeting();
        Ifnu.Name = "Ifnu";
        Ifnu.greet();

        TestGreeting.tryStatic();
        // Greeting.greet();//error

        // TestGreeting.staticGreeting = "hi saya XX"; //Tidak Dianjurkan
    }
     
    public static void tryStatic() {
        System.out.println("try static method");
    }
}
