package answers.designPatterns.decoratorPattern;

public class KingSandwich extends Sandwich {

    public KingSandwich() {
        description = "King Sandwich";
    }

    @Override
    public double getCost() {
        return 1.49;
    }
}
