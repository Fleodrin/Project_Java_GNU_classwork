package Arrays;

public class StringCollection {
    static String[] ingredients = {"Pepperoni", "Onions", "Mushrooms", "Sausage", "Bacon"};

    public static void main(String[] args) {
        for (String ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }
}
