public class TestScoping {
	public static void main(String[] args) {
		ScopeExample scope = new ScopeExample();
        scope.firstMethod();
        scope.printVariable();

        scope.secondMethod(10);
        scope.printVariable();
    }
    
    // public void doComputation() {
    //     int x = (int)(Math.random() * 100);
    //     int y;
    //     int z;

    //     if (x > 50) {
    //      	y = 9;
    //     }

    //     z = y + x; // Possible use before initialization

    //     //jadi nilai variable di local variable harus jelas.
 	// }
        
}
