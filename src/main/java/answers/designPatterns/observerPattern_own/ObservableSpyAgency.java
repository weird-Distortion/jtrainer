package answers.designPatterns.observerPattern_own;

import answers.designPatterns.observerPattern_own.observers.SpyObserver;

public interface ObservableSpyAgency {
    void addObserver(SpyObserver spyObserver);
    void removeObserver(SpyObserver spyObserver);
    void notifyObservers();
}
