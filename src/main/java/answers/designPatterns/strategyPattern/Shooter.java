package answers.designPatterns.strategyPattern;

import answers.designPatterns.strategyPattern.Behavior.ShootInterface;

public abstract class Shooter {
    protected ShootInterface shootInterface;

    public void shoot() {
        shootInterface.shoot();
    }
}
