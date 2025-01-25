package Assistedproblem.animalhierarchy;
// child Class 1
public class Dog extends Animal {

    Dog(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound(String sound){

        System.out.println("Dog sounds " + sound);
    }
}