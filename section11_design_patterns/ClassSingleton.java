package section11_design_patterns;

public final class ClassSingleton {

    private static ClassSingleton INSTANCE;

    private ClassSingleton() {
    }

    public synchronized static ClassSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }

        return INSTANCE;
    }

}
