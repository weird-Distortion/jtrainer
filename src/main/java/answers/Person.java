package answers;

import java.util.List;

public abstract class Person {
    private String name;
    private Country country;
    private int age;
    private String weapon;
    private String phrase;
    private String side;
    private List<Superpower> superpowers;

    public Person(String name, Country country, int age, String weapon, String phrase, String side, List<Superpower> superpowers) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.weapon = weapon;
        this.phrase = phrase;
        this.side = side;
        this.superpowers = superpowers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
