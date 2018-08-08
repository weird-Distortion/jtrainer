package exercises.collections.task3;

import data.DataClass;
import data.Superhero;

import java.util.List;

//TODO complete the lore
/**
 * Lore about finding longest element.
 */
public class LongestName {
    private static List<Superhero> superheroes = DataClass.getSuperheroes();

    public static void main(String[] args) {
        assert superheroes != null;
        System.out.println("Here our superheroes:");
        superheroes.forEach(x -> System.out.print(x.getName() + " "));

        System.out.println("\n\nCounting...\n");

        System.out.println("Longest name is:");
        /* find and print the hero with longest di...name here */
    }
}
