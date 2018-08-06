package data;

import java.util.List;

public class Superhero extends Person {

    private String weapon;
    private String phrase;
    private String side;
    private List<Superpower> superpowers;

    public Superhero(String name, Country country, int age, String weapon, String phrase, String side, List<Superpower> superpowers) {
        super(name, country, age);
        this.weapon = weapon;
        this.phrase = phrase;
        this.side = side;
        this.superpowers = superpowers;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public List<Superpower> getSuperpowers() {
        return superpowers;
    }

    public void setSuperpowers(List<Superpower> superpowers) {
        this.superpowers = superpowers;
    }
}
