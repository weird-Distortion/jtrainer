package answers.designPatterns.decoratorPattern.decorators;

import answers.designPatterns.decoratorPattern.Sandwich;

public class Cheese extends IngredientDecorator {
    private Sandwich sandwich;

    public Cheese(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return sandwich.getCost() + 0.15;
    }
}
