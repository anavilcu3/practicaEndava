package section6_generics.wildcards;

import section6_generics.commons.Shape;
import section6_generics.commons.Triangle;

import java.util.List;

public class Ex1_Wildcard {

    public void printShapes(List<? extends Shape> shapes) {
        System.out.println(shapes);
    }

    public void printParentShapes(List<? super Triangle> shapes) {
        System.out.println(shapes);
    }

    public void printList(List<?> list) {
        System.out.println(list);
    }
}
