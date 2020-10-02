package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.MovieAdItem;
import ru.netology.repository.MovieAdRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class MovieAdManagerNonEmptyTest {
    @Mock
    private MovieAdRepository repository;

    @InjectMocks
    private MovieAdManager manager = new MovieAdManager(5);

    private MovieAdItem first = new MovieAdItem(1, "Bloodshot", "superhero film", "29.05.2020");
    private MovieAdItem second = new MovieAdItem(2, "Onward", "animated film", "05.03.2020");
    private MovieAdItem third = new MovieAdItem(3, "Hotel Belgrad", "comedy", "05.03.2020");
    private MovieAdItem fourth = new MovieAdItem(4, "The Gentlemen", "action comedy", "13.02.2020");
    private MovieAdItem fifth = new MovieAdItem(5, "The Invisible Man", "science fiction horror", "05.03.2020");
    private MovieAdItem sixth = new MovieAdItem(6, "Trolls World Tour", "animated film", "19.03.2020");


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }

    @Test
    public void removeById() {
        int idToRemove = 3;

        MovieAdItem[] returned = new MovieAdItem[]{first, second};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).removeById(idToRemove);

        manager.removeById(idToRemove);
        MovieAdItem[] expected = new MovieAdItem[]{second, first};
        MovieAdItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovieAdListLength() {

        MovieAdItem[] returned = new MovieAdItem[]{first, second, third, fourth, fifth};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).save(fourth);
        doNothing().when(repository).save(fifth);

        manager.add(fourth);
        manager.add(fifth);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOverMovieAdListLength() {

        MovieAdItem[] returned = new MovieAdItem[]{second, third, fourth, fifth, sixth};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).save(fourth);
        doNothing().when(repository).save(fifth);
        doNothing().when(repository).save(sixth);

        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddUnderMovieAdListLength() {

        MovieAdItem[] returned = new MovieAdItem[]{first, second, third, fourth};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).save(fourth);

        manager.add(fourth);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}
