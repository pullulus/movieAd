package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieAdItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieAdMangerEmptyTest {

    private MovieAdManager manager = new MovieAdManager(3);

    @Test
    public void shouldAddMovieAdListLength() {

        MovieAdItem first = new MovieAdItem(1, "The Gentlemen", "action comedy", "13.02.2020");
        MovieAdItem second = new MovieAdItem(2, "The Invisible Man", "science fiction horror", "05.03.2020");
        MovieAdItem third = new MovieAdItem(3, "Trolls World Tour", "animated film", "19.03.2020");

        manager.add(first);
        manager.add(second);
        manager.add(third);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOverMovieAdListLength() {

        MovieAdItem first = new MovieAdItem(1, "Turu, the Wacky Hen", "animated film", "17.09.2020");
        MovieAdItem second = new MovieAdItem(2, "Made in Italy", "comedy", "24.09.2020");
        MovieAdItem third = new MovieAdItem(3, "The New Mutants", "horror", "03.09.2020");
        MovieAdItem fourth = new MovieAdItem(4, "The Gentlemen", "action comedy", "13.02.2020");
        MovieAdItem fifth = new MovieAdItem(5, "The Invisible Man", "science fiction horror", "05.03.2020");
        MovieAdItem sixth = new MovieAdItem(6, "Trolls World Tour", "animated film", "19.03.2020");
        MovieAdItem seventh = new MovieAdItem(7, "Tenet", "action-thriller", "03.09.2020");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{seventh, sixth, fifth};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddUnderMovieAdListLength() {

        MovieAdItem first = new MovieAdItem(1, "Turu, the Wacky Hen", "animated film", "17.09.2020");
        MovieAdItem second = new MovieAdItem(2, "Made in Italy", "comedy", "24.09.2020");

        manager.add(first);
        manager.add(second);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{second, first};

        assertArrayEquals(expected, actual);
    }

}
