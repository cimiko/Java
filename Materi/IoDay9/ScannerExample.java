package go.g2academy.IoDay9;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

    //Print satu data
//        System.out.println("Enter Username");
//        String userName = myObj.nextLine();
//        System.out.println("Username is: " + userName);

    //Print String
        String userName = "";
        while (!userName.equals("stop")){ //userName.equals("stop") == false
            System.out.println("Input Data Here:");
            userName = myObj.nextLine();
            System.out.println("Username is: " + userName);
        }

    //Print Integer
        Integer numb = 0;
        while (numb != -1){
            System.out.println("Input Number Here:");
            numb = myObj.nextInt();
            System.out.println("Numb is: " + numb);
        }

        myObj.close();
    }
}
