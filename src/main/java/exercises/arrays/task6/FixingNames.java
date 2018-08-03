package exercises.arrays.task6;

import java.util.Arrays;

//TODO Complete lore.
/**
 * Trimming
 */

public class FixingNames {

    private static final String[] superheroes = {"  Emmanuel   ", " Giuseppe   ", "  Angela ", "Donald  ", "    Justin", "Shinzo       ", "Vladimir    ", "Teresa            "};

    public static void main(String[] args) {
        System.out.println("Here our superheroes:\n" + Arrays.toString(superheroes) + " !\n");
        System.out.println("Fixing...\n");

        fixTroubles(superheroes);
    }

    public static void fixTroubles(String[] superheroes) {
        assert superheroes != null;
        /* fix designer's mistake here */
    }
}
