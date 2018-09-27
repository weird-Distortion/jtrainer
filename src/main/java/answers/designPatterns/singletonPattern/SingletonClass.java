package answers.designPatterns.singletonPattern;

public class SingletonClass {
    private static SingletonClass singletonClass;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (singletonClass == null) singletonClass = new SingletonClass();

        return singletonClass;
    }

    //other class methods
}
