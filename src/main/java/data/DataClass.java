package data;

import java.util.Arrays;
import java.util.List;

public class DataClass {
    private static List<Superhero> superheroes = Arrays.asList(
            new Superhero("Emmanuel", new Country("France", 15000), 35, "Frogs", "je ma pelle", "NAH"
                    , Arrays.asList(new Superpower("Speach", 2)
                    , new Superpower("Wife", 5))),
            new Superhero("Giuseppe", new Country("Italy", 10000), 58, "Pasta", "si si", "NAH"
                    , Arrays.asList(new Superpower("Family", 5)
                    , new Superpower("Pizza", 3))),
            new Superhero("Angela", new Country("Germany", 30000), 60, "Immigrants", "ja ja", "NAH"
                    , Arrays.asList(new Superpower("Speach", 8)
                    , new Superpower("Money", 8))),
            new Superhero("Donald", new Country("USA", 40000), 70, "m16", "Something great again", "NAH"
                    , Arrays.asList(new Superpower("Tweets", 9)
                    , new Superpower("Oil", 9))),
            new Superhero("Justin", new Country("Canada", 38000), 33, "Syrop", "eh?", "NAH"
                    , Arrays.asList(new Superpower("Socks", 7)
                    , new Superpower("Snow", 3))),
            new Superhero("Shinzo", new Country("Japan", 12000), 59, "Sushi", "ewriuvb knr wakarikkah", "NAH"
                    , Arrays.asList(new Superpower("Tech", 8)
                    , new Superpower("Anime", 6))),
            new Superhero("Vladimir", new Country("Russia", 30000), 65, "Iskander", "for mazer Russia", "OAC"
                    , Arrays.asList(new Superpower("Speach", 9)
                    , new Superpower("Rockets", 8))),
            new Superhero("Teresa", new Country("England", 26000), 60, "Tea", "OY!", "NAH"
                    , Arrays.asList(new Superpower("Humor", 5)
                    , new Superpower("BBC", 2))));

    public static List<Superhero> getSuperheroes() {
        return superheroes;
    }

    public static void setSuperheroes(List<Superhero> superheroes) {
        DataClass.superheroes = superheroes;
    }


}
