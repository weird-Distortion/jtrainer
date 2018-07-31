package answers;

import java.util.List;

public class Country {
    private String countryName;
    private int population;
    private List<Person> citizens;

    public Country(String countryName, int population, List<Person> citizens) {
        this.countryName = countryName;
        this.population = population;
        this.citizens = citizens;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Person> getCitizens() {
        return citizens;
    }

    public void setCitizens(List<Person> citizens) {
        this.citizens = citizens;
    }
}
