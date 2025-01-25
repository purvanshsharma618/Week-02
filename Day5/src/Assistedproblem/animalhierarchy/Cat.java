package Assistedproblem.animalhierarchy;
// child Class 2
public class Cat extends Animal{

    Cat(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound(String sound){

        System.out.println("Cat sound " + sound);
    }

}