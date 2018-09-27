package answers.designPatterns.decoratorPattern;

public abstract class Sandwich {

    String description = "some sandwich";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
