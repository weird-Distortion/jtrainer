package exercises.collections.task2;

import data.DataClass;
import data.Superhero;

import java.util.List;

//TODO add lore. Sorting by name length then print
/**
 * Lore
 */
public class SortingByNameLength {
    private static List<Superhero> superheroes = DataClass.getSuperheroes();

    public static void main(String[] args) {
        System.out.println("Here our superheroes:");
        superheroes.forEach(x -> System.out.print(x.getName() + " "));

        System.out.println("\n\nSorting...\n");

        System.out.println("Now heroes are sorted:");
        /* sort and then print heroes here */
    }
}
