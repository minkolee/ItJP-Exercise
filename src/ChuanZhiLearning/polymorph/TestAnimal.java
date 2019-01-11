package ChuanZhiLearning.polymorph;

import java.util.Date;

public class TestAnimal {
    public static void main(String[] args) {

//        Animal a1 = new Dog();
//        Animal a2 = new Cat();
//        Animal a3 = new Animal();
//
//
//        testAnimal(a1);
//        testAnimal(a2);
//        testAnimal(a3);

        Animal a4 = testReturn();

        testAnimal(a4);

    }

    public static void testAnimal(Animal animal) {
        animal.eat();
        if (animal instanceof Dog) {
            ((Dog) animal).keepHome();
        }

        else if (animal instanceof Cat) {
            ((Cat) animal).catchMouse();
        }

    }

    public static Animal testReturn() {
        Animal tempCat = new Dog();
        return tempCat;

    }

}


class Animal {

    public void eat() {
        System.out.println("Animal can eat many things");

    }
}

class Dog extends Animal {

    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void keepHome() {
        System.out.println("Keeping home...");
    }
}

class Cat extends Animal {
    public void catchMouse() {
        System.out.println("Catching mouse...");
    }

    public void eat() {
        System.out.println("Cat is eating....");
    }
}