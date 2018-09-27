package answers.designPatterns.observerPattern_java9;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class SpyAgency {
    private PropertyChangeSupport support;
    private String aimName;
    private String aimLastname;

    public SpyAgency() {
        support = new PropertyChangeSupport(this);
        aimName = "Max";
        aimLastname = "Mad";
    }

    public void addListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public String getAimName() {
        return aimName;
    }

    public void setAimName(String aimName) {
        support.firePropertyChange("aimName", this.aimName, aimName);
        this.aimName = aimName;
    }

    public String getAimLastname() {
        return aimLastname;
    }

    public void setAimLastname(String aimLastname) {
        support.firePropertyChange("aimLastname", this.aimLastname, aimLastname);
        this.aimLastname = aimLastname;
    }
}
