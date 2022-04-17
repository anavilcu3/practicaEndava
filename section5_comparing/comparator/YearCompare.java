package section5_comparing.comparator;

import section5_comparing.comparable.Movie;

import java.util.Comparator;

public class YearCompare  implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getYear() - movie2.getYear();
    }
}