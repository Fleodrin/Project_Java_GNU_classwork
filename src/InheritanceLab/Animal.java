package InheritanceLab;

import java.util.ArrayList;

public class Animal {
    public void bark() {
        System.out.println("Animal sound");
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Cow());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Lion());

        for (Animal animal : animals) {
            animal.bark();
        }
    }
}
