package answers.designPatterns.strategyPattern;

import answers.designPatterns.strategyPattern.Behavior.GunShot;
import answers.designPatterns.strategyPattern.Behavior.RockShot;
import answers.designPatterns.strategyPattern.Behavior.ShootInterface;

public class StrategySimulator {
    public static void main(String[] args) {
        ShootInterface gun = new GunShot();
        ShootInterface rock = new RockShot();

        Shooter shooter = new RockShooter(rock);
        shooter.shoot();

        Shooter shooter2 = new GunShooter(gun);
        shooter2.shoot();
    }
}
