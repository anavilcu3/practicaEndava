package section3_inheritance.interfaces.ex2.classes;

public interface Bird extends BaseClass {

    default boolean hasFeathers() {
        return true;
    }
}
