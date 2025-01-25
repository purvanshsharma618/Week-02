package Assistedproblem.animalhierarchy;
//Child Class 3
public class Bird extends Animal{

    Bird(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound(String sound){
        System.out.println("Bird sounds " + sound);
    }
}