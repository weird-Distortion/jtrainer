package answers.designPatterns.adapterPattern;

public class AdapterSimulator {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        ClassA classA = new ClassA(new AdapterAB(classB));

        classA.useAdaper();
    }
}
