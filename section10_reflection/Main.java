package section10_reflection;

import section10_reflection.model.Goat;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        Object object = getInstance();

        //get class
        Class<?> clazz = object.getClass();


        System.out.println("Simple name: " + clazz.getSimpleName());
        System.out.println("Canonical name" + clazz.getCanonicalName());
        System.out.println("Package name" + clazz.getPackageName());

        //get class by name
        try {
            clazz = Class.forName("namesection10_reflection.model.Goat");
        } catch (ClassNotFoundException e) {
            System.out.println("Class namesection10_reflection.model.Goat not found");
        }
        int modifiers = clazz.getModifiers();
        System.out.println("Modifiers value: " + modifiers);
        if (Modifier.isPublic(modifiers)) {
            System.out.println("Modifier: public");
        } else if (Modifier.isPrivate(modifiers)) {
            System.out.println("Modifier: private");
        } else if (Modifier.isProtected(modifiers)) {
            System.out.println("Modifier: protected");
        } else {
            System.out.println("Modifier: default");
        }

        //get package
        Package aPackage = clazz.getPackage();
        System.out.println("Package name: " + aPackage.getName());

        //get superclass
        Class<?> superclass = clazz.getSuperclass();
        System.out.println("Superclass:" + superclass.getSimpleName());

        //get interfaces
        Class<?>[] interfaces = superclass.getInterfaces();

        //get fields
        Field[] fields = clazz.getFields();                 //only public fields (from current & inherited)
        Field[] declaredFields = clazz.getDeclaredFields(); //all access modifiers (but only from current class)

        System.out.println("Fields:");
        for (int i = 0; i < fields.length; i++) {
            System.out.print(fields[i].getName() + " ");
        }
        System.out.println();

        System.out.println("Declared Fields:");
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            System.out.print(field.getName() + " ");
            if (field.getName().equals("colour")) {
                field.setAccessible(true);
                field.set(object, "red");
            }
        }
        System.out.println("New object: " + object.toString());
        System.out.println();


        //get constructors
        Constructor<?>[] constructors = clazz.getConstructors();
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();

        Constructor<?> constructor = clazz.getConstructor(String.class, String.class);
        Object newInstance = constructor.newInstance("name1", "green");
        System.out.println("Object from new constructor: " + newInstance);

        //get methods
        Method[] methods = clazz.getMethods();
        Method[] declaredMethods = clazz.getDeclaredMethods();

        for (int i = 0; i < methods.length; i++) {
            if ("getColour".equals(methods[i].getName())) {
                String result = (String) methods[i].invoke(object);
                System.out.println(result);
            }
        }

    }

    public static Object getInstance() {
        return new Goat("goat", "white");
    }
}
