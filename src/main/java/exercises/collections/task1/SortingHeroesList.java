package exercises.collections.task1;

import data.DataClass;
import data.Superhero;

import java.util.List;

//TODO change lore
/**
 * Our superheroes have a kindly meeting today.
 * But they don't know where each one has to seat.
 * Help them to take seats by alphabet order.
 * Print the result in terminal.
 */
public class SortingHeroesList {

    private static List<Superhero> superheroes = DataClass.getSuperheroes();

    public static void main(String[] args) {
        System.out.println("Here our superheroes:");
        superheroes.forEach(x -> System.out.print(x.getName() + " "));

        System.out.println("\n\nSorting...\n");

        System.out.println("Now heroes are sorted:");

        /* sort and then print heroes here */

    }
}
