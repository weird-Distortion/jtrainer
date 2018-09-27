package answers.designPatterns.decoratorPattern.decorators;

import answers.designPatterns.decoratorPattern.Sandwich;

public abstract class IngredientDecorator extends Sandwich {

    public abstract String getDescription();
}
