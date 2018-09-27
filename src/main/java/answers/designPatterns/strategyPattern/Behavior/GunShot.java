package answers.designPatterns.strategyPattern.Behavior;

public class GunShot implements ShootInterface {
    @Override
    public void shoot() {
        System.out.println("User makes shots with gun");
    }
}
