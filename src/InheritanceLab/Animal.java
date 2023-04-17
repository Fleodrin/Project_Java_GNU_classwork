package InheritanceLab;

public class Animal {
    public void bark() {
        System.out.println("Animal sound");
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        Cow cow = new Cow();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Lion lion = new Lion();

        animals[0] = cow;
        animals[1] = dog;
        animals[2] = cat;
        animals[3] = lion;

        for (int i = 0; i < animals.length; i++) {
            animals[i].bark();
        }
    }
}
