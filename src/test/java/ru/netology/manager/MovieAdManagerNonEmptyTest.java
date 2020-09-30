package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieAdItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieAdManagerNonEmptyTest {
    MovieAdManager manager = new MovieAdManager(5);
    MovieAdItem first = new MovieAdItem(1, "Bloodshot", "superhero film", "29.05.2020");
    MovieAdItem second = new MovieAdItem(2, "Onward", "animated film", "05.03.2020");
    MovieAdItem third = new MovieAdItem(3, "Hotel Belgrad", "comedy", "05.03.2020");
    MovieAdItem fourth = new MovieAdItem(4, "The Gentlemen", "action comedy", "13.02.2020");
    MovieAdItem fifth = new MovieAdItem(5, "The Invisible Man", "science fiction horror", "05.03.2020");
    MovieAdItem sixth = new MovieAdItem(6, "Trolls World Tour", "animated film", "19.03.2020");


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }

    @Test
    public void shouldAddMovieAdListLength() {

        manager.add(fourth);
        manager.add(fifth);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOverMovieAdListLength() {

        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddUnderMovieAdListLength() {

        manager.add(fourth);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}
