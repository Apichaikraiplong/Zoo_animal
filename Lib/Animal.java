package Lib;
public abstract class Animal {
    // variable
    private final String name;

    // constructor
    public Animal(String name){
        this.name = name ;
    }
    
    // method
    public String getName(){
        return name;
    }

    public abstract String makeSound();
}
