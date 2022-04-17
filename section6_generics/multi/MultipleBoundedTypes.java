package section6_generics.multi;

import section6_generics.commons.Circle;
import section6_generics.commons.Polygon;
import section6_generics.commons.Shape;
import section6_generics.commons.Triangle;

public class MultipleBoundedTypes {

    public static <T extends Polygon & Shape> long getPerimeter(T t) {
        //to do: implementation
        return 0;
    }

    public static void main(String[] args) {
        long perimeter = getPerimeter(new Triangle());
        //perimeter = getPerimeter(new Circle());  //compile error
    }
}
