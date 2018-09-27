package answers.designPatterns.strategyPattern;

import answers.designPatterns.strategyPattern.Behavior.ShootInterface;

public class GunShooter extends Shooter {

    public GunShooter(ShootInterface shootInterface) {
        this.shootInterface = shootInterface;
    }
}
