package section9_functional.stream.operations;

import java.util.stream.Stream;

public class Ex7_Match {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four");
        boolean anyMatch = stream.anyMatch(s -> s.length() == 2);
        System.out.println(anyMatch);

        stream = Stream.of("four", "four", "four", "four");
        boolean allMatch = stream.allMatch(s -> s.equals("four"));
        System.out.println(allMatch);

        stream = Stream.of("one", "two", "three", "four");
        boolean noneMatch = stream.noneMatch(s -> s.contains("seven"));
        System.out.println(noneMatch);

    }
}
