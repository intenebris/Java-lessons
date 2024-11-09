package lessonOOP7.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();

        // Singleton singleton1 = new Singleton();
    }
}
