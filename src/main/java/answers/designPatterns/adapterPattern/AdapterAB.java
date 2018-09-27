package answers.designPatterns.adapterPattern;

public class AdapterAB implements AdapterInterface {
    private ClassB classB;

    public AdapterAB(ClassB classB) {
        this.classB = classB;
    }

    @Override
    public void adapt() {
        classB.describe();
    }
}
