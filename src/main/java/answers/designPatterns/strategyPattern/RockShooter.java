package answers.designPatterns.strategyPattern;

import answers.designPatterns.strategyPattern.Behavior.ShootInterface;

public class RockShooter extends Shooter {

    public RockShooter(ShootInterface shootInterface) {
        this.shootInterface = shootInterface;
    }

}
