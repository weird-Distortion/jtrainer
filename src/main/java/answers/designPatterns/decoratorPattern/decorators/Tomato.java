package answers.designPatterns.decoratorPattern.decorators;

import answers.designPatterns.decoratorPattern.Sandwich;

public class Tomato extends IngredientDecorator {
    private Sandwich sandwich;

    public Tomato(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + ", Tomato";
    }

    @Override
    public double getCost() {
        return sandwich.getCost() + 0.5;
    }
}
