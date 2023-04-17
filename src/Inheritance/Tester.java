package Inheritance;

public class Tester {
    public static void main(String[] args) {
        Dude dude = new Dude();
        GrandWizard grandWizard = new GrandWizard();
        grandWizard.name = "Flash";
        grandWizard.sayName();

        grandWizard.punchFace(dude);
    }
}
