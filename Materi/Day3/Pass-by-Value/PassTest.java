public class PassTest {
    	
    // Methods to change the current values
    public static void changeInt(int value) {
     	value = 55;
    }
    
    public static void main(String args[]) {
     	
     	int val;
    	
     	// Assign the int
     	val = 11;
     	// Try to change it
     	changeInt(val);
     	// What is the current value?
        System.out.println("Int value is: " + val);
    }
}