package Lib;

public class Dolphin extends Mamal implements Swimable {

    public Dolphin(String name){
        super(name);
    }

    @Override
    public String swim() {
        return "The dolphin playfully swims in the sea. ";
    }

    @Override
    public String makeSound() {
        return "Clicking sounds";
    }
    
}
