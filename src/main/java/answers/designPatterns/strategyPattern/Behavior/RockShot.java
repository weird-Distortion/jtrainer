package answers.designPatterns.strategyPattern.Behavior;

public class RockShot implements ShootInterface {
    @Override
    public void shoot() {
        System.out.println("User makes shot with rocks!");
    }
}
