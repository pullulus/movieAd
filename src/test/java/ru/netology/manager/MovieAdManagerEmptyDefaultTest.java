package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieAdItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieAdManagerEmptyDefaultTest {

    private MovieAdManager manager = new MovieAdManager();

    @Test
    public void shouldGetAll() {

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[0];

        assertArrayEquals(expected, actual);
    }

    }
