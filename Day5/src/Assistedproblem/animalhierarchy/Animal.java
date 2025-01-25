package Assistedproblem.animalhierarchy;

//Parent class
public class Animal {

    String name;
    int age;
    String color;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(String sound){

        System.out.println("Animal sounds " + sound);
    }
    void displayDetails(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}
