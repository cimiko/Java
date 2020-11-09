package go.g2academy.ExceptionHandlingDay11;

import java.io.FileNotFoundException;

public class AgeValidator {

    public boolean validate(int age){ // no throws keywords
        if(age < 18){
            //unchecked exception
            throw new ArithmeticException("Invalid Age");
        }else {
            return true;
        }
    }

    public boolean validateGender(String gender) throws FileNotFoundException{
        if(gender.equals("male") || gender.equals("female")){
            return true;
        }else {
            throw new FileNotFoundException("Gender is not found");
        }
    }
}
