package data;

import java.util.List;

public class Side {
    private String sideName;
    private List<Country> countries;
    private int countriesAmount;

    public Side(String sideName, List<Country> countries) {
        this.sideName = sideName;
        this.countries = countries;

        this.countriesAmount = this.countries.size();
    }

    public String getSideName() {
        return sideName;
    }

    public void setSideName(String sideName) {
        this.sideName = sideName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public int getCountriesAmount() {
        return countriesAmount;
    }

    public void setCountriesAmount(int countriesAmount) {
        this.countriesAmount = countriesAmount;
    }
}
