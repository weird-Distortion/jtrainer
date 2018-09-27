package answers.designPatterns.decoratorPattern;

public class RoyalSandwich extends Sandwich {

    public RoyalSandwich() {
        description = "Royal Sandwich";
    }

    @Override
    public double getCost() {
        return 2.99;
    }
}
