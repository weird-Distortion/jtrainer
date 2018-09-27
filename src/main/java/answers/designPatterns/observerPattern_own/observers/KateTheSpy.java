package answers.designPatterns.observerPattern_own.observers;

public class KateTheSpy implements SpyObserver {

    private String aimName;
    private String aimLastname;

    @Override
    public void updateInfo(String aimName, String aimLastname) {
        setAimName(aimName);
        setAimLastname(aimLastname);
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
