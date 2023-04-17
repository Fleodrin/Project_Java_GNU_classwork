package Inheritance;

import java.util.ArrayList;

public class Wizard extends Dude{
    ArrayList<String> spells;

    public void cast(String spell) {
        mp -= 10;
    }
}
