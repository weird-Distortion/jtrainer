package answers.designPatterns.observerPattern_java9;

import answers.designPatterns.observerPattern_java9.observers.IvanTheSpy;

public class ObserverJava9Main {
    public static void main(String[] args) {
        IvanTheSpy ivan = new IvanTheSpy();
        SpyAgency agency = new SpyAgency();

        System.out.println(ivan.getAimName());

        agency.addListener(ivan);
        System.out.println(ivan.getAimName());

        agency.setAimName("mike");
        System.out.println(ivan.getAimName());
    }
}
