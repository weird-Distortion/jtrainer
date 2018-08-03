package answers.arrays.task6;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

//TODO complete lore

/**
 * Trimming
 */

public class Solution {

    private static final String[] superheroes = {"  Emmanuel   ", " Giuseppe   ", "  Angela ", "Donald  ", "    Justin", "Shinzo       ", "Vladimir    ", "Teresa            "};

    public static void main(String[] args) {
        System.out.println("Here our superheroes:\n" + Arrays.toString(superheroes) + " !\n");
        System.out.println("Fixing...\n");

        fixTroubles(superheroes);
    }

    /**
     * Create stream
     * Create resulting list
     * Make stream
     * Map trimmed results
     * Collect to the resulting list
     * Printing
     *
     * @param superheroes - superheroes' names
     */
    public static void fixTroubles(String[] superheroes) {
        assert superheroes != null;
        List<String> resultList = Arrays.stream(superheroes)
                                        .map(String::trim)
                                        .collect(toList());

        System.out.println(resultList.toString());
    }
}
