public class luasBangun {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        double half = 0.5;
        double phi = 3.14;

        double result = segitigaFunction(a,b,half);
        int result2 = persegiFunction(a);
        double result3 = lingkaranFunction(b,phi);

        System.out.println("Luas Segitiga: " + Math.round(result) + "cm");
        System.out.println("Luas Persegi: " + result2 + "cm");
        System.out.println("Luas Lingkaran: " + Math.round(result3) + "cm");

    }

    public static double segitigaFunction(double n1, double n2, double hlf){
        double segitiga;
        
        segitiga = hlf * (n1 * n2);
        
        // int segitiga;

        // segitiga = (n1 * n2)/2;
        return segitiga;
    }

    public static int persegiFunction(int n) {
        int persegi;

        persegi = n * n;

        return persegi;
    }

    public static double lingkaranFunction(double n1, double pi){
        double circle;

        circle = pi * (n1 * n1);

        return circle;
    } 
}