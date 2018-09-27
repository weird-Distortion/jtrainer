package answers.designPatterns.observerPattern_own;

import answers.designPatterns.observerPattern_own.observers.JohnTheSpy;
import answers.designPatterns.observerPattern_own.observers.KateTheSpy;

public class ObserverSimulator {
    public static void main(String[] args) {
        SpyAgency agency = new SpyAgency();
        JohnTheSpy john = new JohnTheSpy();
        KateTheSpy kate = new KateTheSpy();

        agency.addObserver(kate);
        System.out.println(kate.getAimName());
        agency.setAimName("NewMax");
        System.out.println(kate.getAimName());
    }
}
