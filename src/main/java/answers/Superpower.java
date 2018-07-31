package answers;

public class Superpower {
    private String superpowerName;
    private int powerCapacity;

    public Superpower(String superpowerName, int powerCapacity) {
        this.superpowerName = superpowerName;
        this.powerCapacity = powerCapacity;
    }

    public String getSuperpowerName() {
        return superpowerName;
    }

    public void setSuperpowerName(String superpowerName) {
        this.superpowerName = superpowerName;
    }

    public int getPowerCapacity() {
        return powerCapacity;
    }

    public void setPowerCapacity(int powerCapacity) {
        this.powerCapacity = powerCapacity;
    }
}
