package Lib;

public class Mamal extends Animal {

    public Mamal(String name){
        super(name);
    }

    @Override
    public String makeSound() {
        return "Mammal sound";
    }
    
    
}
