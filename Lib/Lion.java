package Lib;

public class Lion extends Animal {
    public Lion(String name){
        super(name);
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }
    
}
