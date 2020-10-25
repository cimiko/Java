public class PassTest {

    // Methods to change the current values
    public static void changeInt(int value) {
        value = 55;
    }

    public static void changeObjectRef(MyDate ref) {
     	ref = new MyDate(1, 1, 2000);
    }

    public static void changeReference(MyDate date){
 	    date.setDay(4);
    }

    public static void changeString(String str) {
        str = "new Value";
    }
    
    public static void changeNumb(int number) {
        number = 100;
    }

    public static void main(String args[]) {
        
        //variable declaration
        int val;
     	// Assign the int
     	val = 11;
     	// Try to change it
     	changeInt(val);
     	// What is the current value?
     	System.out.println("Int value is: " + val);
        
        //this operation change value of refrence
        MyDate today = new MyDate(25,10,2020);
        changeReference(today);
        today.showMyDate();

        //tidak bisa dirubah
        String str = "This is a original value";
        changeString(str);
        System.out.println("String value is: " + str);
         
        int number = 5;
        changeNumb(number);
     	System.out.println("Numb value is: " + number);

    }
}
         
    
    