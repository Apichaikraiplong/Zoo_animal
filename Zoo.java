import java.util.ArrayList;

import Lib.Animal;
import Lib.Bird;
import Lib.Dolphin;
import Lib.Eagle;
import Lib.Flyable;
import Lib.Lion;
import Lib.Penguin;
import Lib.Swimable;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> zoo_animal = new ArrayList<>();

        zoo_animal.add(new Lion("Lion"));
        zoo_animal.add(new Dolphin("Dolphin"));
        zoo_animal.add(new Eagle("Eagle"));
        zoo_animal.add(new Bird("Bird"));
        zoo_animal.add(new Penguin("Penguin"));
        
        System.out.println("-----Sound animal-----");
        for (Animal a : zoo_animal) {
            System.out.println(a.getName() + " : " + a.makeSound());
        }
        
        System.out.println("-----Ability animal-----");
         for (Animal a : zoo_animal) {
           if (a instanceof Flyable) {
                System.out.println(a.getName() + " : " + ((Flyable)a).fly());
           }else if (a instanceof Swimable) {
                System.out.println(a.getName() + " : " + ((Swimable)a).swim());
           }else
                System.out.println(a.getName() +" : Walking in Zoo");
        }
        
    }
}
