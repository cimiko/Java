package go.g2academy.OopDay10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

//Dog Test
public class IsATest {

    @Test
    public void testMammalIsAnAnimal() {
        Mammal mammal = new Mammal();
        assertTrue(mammal instanceof Animal);
    }

    @Test
    public void testDogIsAnAnimal() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Animal);
    }

    @Test
    public void testDogIsAMammal() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Mammal);
    }

    @Test
    public void testBenefitDeclareWithParentClass() {
        Animal animal = new Animal();
        Animal animal1 = new Mammal();
        Animal animal2 = new Reptile();

        Animal[] animals = {animal,animal1,animal2};

        //coding to interface
        List <String> data = new ArrayList<>();
    }
}