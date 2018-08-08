package answers.collections.task3;

import data.DataClass;
import data.Person;
import data.Superhero;

import java.util.List;

import static java.util.Comparator.comparing;

//TODO add lore. Finding longest name with Optional;
/**
 * Lore
 */
public class Solution {
    private static List<Superhero> superheroes = DataClass.getSuperheroes();

    public static void main(String[] args) {
        assert superheroes != null;
        System.out.println("Here our superheroes:");
        superheroes.forEach(x -> System.out.print(x.getName() + " "));

        System.out.println("\n\nCounting...\n");

        System.out.println("Longest name is:");
        System.out.println(superheroes.stream().map(Person::getName).max(comparing(String::length)).get());
    }
}
