package answers.designPatterns.observerPattern_own;

import answers.designPatterns.observerPattern_own.observers.SpyObserver;

import java.util.ArrayList;
import java.util.List;

public class SpyAgency implements ObservableSpyAgency {
    private List<SpyObserver> observers;
    private String aimName;
    private String aimLastname;


    public SpyAgency() {
        observers = new ArrayList<>();
        aimName = "Max";
        aimLastname = "Mad";
    }

    @Override
    public void addObserver(SpyObserver newObserver) {
        assert observers != null;
        observers.add(newObserver);
        update();
    }

    @Override
    public void removeObserver(SpyObserver observer) {
        assert observers != null;
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.updateInfo(getAimName(), getAimLastname()));
    }

    public void update() {
        notifyObservers();
    }

    public String getAimName() {
        return aimName;
    }

    public void setAimName(String aimName) {
        this.aimName = aimName;
        update();
    }

    public String getAimLastname() {
        return aimLastname;
    }

    public void setAimLastname(String aimLastname) {
        this.aimLastname = aimLastname;
        update();
    }
}
