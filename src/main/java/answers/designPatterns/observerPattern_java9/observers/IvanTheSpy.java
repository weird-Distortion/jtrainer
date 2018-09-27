package answers.designPatterns.observerPattern_java9.observers;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class IvanTheSpy implements PropertyChangeListener {

    private String aimName;
    private String aimLastname;

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        setAimName(String.valueOf(propertyChangeEvent.getNewValue()));
        setAimLastname(String.valueOf(propertyChangeEvent.getNewValue()));
    }

    public String getAimName() {
        return aimName;
    }

    public void setAimName(String aimName) {
        this.aimName = aimName;
    }

    public String getAimLastname() {
        return aimLastname;
    }

    public void setAimLastname(String aimLastname) {
        this.aimLastname = aimLastname;
    }
}
