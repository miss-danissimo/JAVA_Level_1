package lesson06;


import lesson6.Animal;
import lesson6.Cat;
import lesson6.Dog;

import java.util.Random;

public class HW6 {

    public static void main(String[] args) {
        lesson6.Animal[] pets = preparePets();
        playGame(pets);
    }

    private static lesson6.Animal[] preparePets() {
        return new lesson6.Animal[] {
                new lesson6.Cat(100, 9),
                new lesson6.Dog(23,56),
                new lesson6.Cat(300, 3),
                new lesson6.Cat(115, 0),
                new lesson6.Dog(1000,15),
                new lesson6.Dog(3, 30),
                new lesson6.Cat(0, 0)
        };
    }

    private static void playGame(lesson6.Animal[] pets) {
        Random random = new Random();

        for (lesson6.Animal pet : pets) {
            pet.printInfo();
            System.out.println(pet.swim(random.nextInt(100)));
            System.out.println(pet.run(random.nextInt(300)));
            System.out.println();
        }

        System.out.println(Animal.getCount());
        System.out.println(Dog.getCount());
        System.out.println(Cat.getCount());

    }

}
