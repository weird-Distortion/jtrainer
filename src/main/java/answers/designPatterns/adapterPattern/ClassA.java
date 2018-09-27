package answers.designPatterns.adapterPattern;

public class ClassA {
    private AdapterInterface adapter;

    public ClassA(AdapterInterface adapter) {
        this.adapter = adapter;
    }

    public void useAdaper() {
        adapter.adapt();
    }
}
