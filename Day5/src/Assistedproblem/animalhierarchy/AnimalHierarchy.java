package Assistedproblem.animalhierarchy;

import java.util.Scanner;
//Controller Class
public class AnimalHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Details of Animal :");
        Animal animal = new Animal("Lion", 20);
        animal.displayDetails();
        animal.makeSound("Roar");
        System.out.println();

        System.out.println("Details of Dog :");
        Dog dog = new Dog("Sheru", 11);
        dog.displayDetails();
        dog.makeSound("Barks");
        System.out.println();

        System.out.println("Details of Cat:");
        Cat cat = new Cat("Billi", 11);
        cat.displayDetails();
        dog.makeSound("Meow");
        System.out.println();

        System.out.println("Details of Bird :");
        Bird bird = new Bird("Parrot", 3);
        bird.displayDetails();
        bird.makeSound("Chapping");
    }
}