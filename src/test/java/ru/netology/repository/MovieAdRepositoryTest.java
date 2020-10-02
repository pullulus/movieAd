package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieAdItem;
import ru.netology.manager.MovieAdManager;

import static org.junit.jupiter.api.Assertions.*;

class MovieAdRepositoryTest {
    private MovieAdRepository repository = new MovieAdRepository();
    private MovieAdItem first = new MovieAdItem(1, "Bloodshot", "superhero film", "29.05.2020");
    private MovieAdItem second = new MovieAdItem(2, "Onward", "animated film", "05.03.2020");
    private MovieAdItem third = new MovieAdItem(3, "Hotel Belgrad", "comedy", "05.03.2020");
    private MovieAdItem fourth = new MovieAdItem(4, "The Gentlemen", "action comedy", "13.02.2020");

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
    }

    @Test
    void save() {
        repository.save(fourth);

        MovieAdItem[] actual = repository.findAll();
        MovieAdItem[] expected = new MovieAdItem[]{first, second, third, fourth};

        assertArrayEquals(expected, actual);
    }

    @Test
     void removeAll() {

        MovieAdItem[] actual = repository.removeAll();
        MovieAdItem[] expected = new MovieAdItem[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeById() {

        int idToRemove = 2;
        repository.removeById(idToRemove);

        MovieAdItem[] actual = repository.findAll();
        MovieAdItem[] expected = new MovieAdItem[] {first, third};

        assertArrayEquals(expected, actual);

    }

    @Test
    void findByIdIfExists() {

        MovieAdItem actual = repository.findById(1);
        MovieAdItem expected = first;

        assertEquals(expected, actual);
    }

    @Test
    void findByIdIfNonExists() {

        MovieAdItem actual = repository.findById(4);
        MovieAdItem expected = null;

        assertEquals(expected, actual);
    }

}