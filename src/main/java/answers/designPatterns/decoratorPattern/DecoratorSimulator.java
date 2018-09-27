package answers.designPatterns.decoratorPattern;

import answers.designPatterns.decoratorPattern.decorators.Cheese;
import answers.designPatterns.decoratorPattern.decorators.Tomato;

public class DecoratorSimulator {
    public static void main(String[] args) {
        Sandwich sandwich = new RoyalSandwich();
        System.out.println(sandwich.getDescription());
        System.out.println(sandwich.getCost());

        sandwich = new Cheese(sandwich);
        System.out.println(sandwich.getDescription());
        System.out.println(sandwich.getCost());

        sandwich = new Tomato(sandwich);
        System.out.println(sandwich.getDescription());
        System.out.println(sandwich.getCost());
    }
}
