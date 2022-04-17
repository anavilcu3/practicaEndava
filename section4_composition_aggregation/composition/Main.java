package section4_composition_aggregation.composition;

public class Main {

    public static void main(String[] args) {
        Chapter[] chapters = {new Chapter("name", null), new Chapter("name")};

        Book book = new Book("name", "auth", chapters);

        //Chapter.builder().name("...").authro(..).build();
    }
}
