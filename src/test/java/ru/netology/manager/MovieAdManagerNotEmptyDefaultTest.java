package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.MovieAdItem;
import ru.netology.repository.MovieAdRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class MovieAdManagerNotEmptyDefaultTest {
    @Mock
    private MovieAdRepository repository;
    @InjectMocks
    private MovieAdManager manager;
    private MovieAdItem first = new MovieAdItem(1, "Bloodshot", "superhero film", "29.05.2020");
    private MovieAdItem second = new MovieAdItem(2, "Onward", "animated film", "05.03.2020");
    private MovieAdItem third = new MovieAdItem(3, "Hotel Belgrad", "comedy", "05.03.2020");
    private MovieAdItem fourth = new MovieAdItem(4, "The Gentlemen", "action comedy", "13.02.2020");
    private MovieAdItem fifth = new MovieAdItem(5, "The Invisible Man", "science fiction horror", "05.03.2020");
    private MovieAdItem sixth = new MovieAdItem(6, "Trolls World Tour", "animated film", "19.03.2020");
    private MovieAdItem seventh = new MovieAdItem(7, "Tenet", "action-thriller", "03.09.2020");
    private MovieAdItem eighth = new MovieAdItem(8, "Mulan", "action drama", "03.09.2020");
    private MovieAdItem ninth = new MovieAdItem(9, "Malasana", "horror", "17.09.2020");
    private MovieAdItem tenth = new MovieAdItem(10, "Antebellum", "horror", "17.09.2020");
    private MovieAdItem eleventh = new MovieAdItem(11, "Re loca", "comedy", "24.09.2020");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }

    @Test
    public void removeById() {
        int idToRemove = 2;

        MovieAdItem[] returned = new MovieAdItem[]{first, third};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).removeById(idToRemove);

        manager.removeById(idToRemove);
        MovieAdItem[] expected = new MovieAdItem[]{third, first};
        MovieAdItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovieAdListLength() {

        MovieAdItem[] returned = new MovieAdItem[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).save(fourth);
        doNothing().when(repository).save(fifth);
        doNothing().when(repository).save(sixth);
        doNothing().when(repository).save(seventh);
        doNothing().when(repository).save(eighth);
        doNothing().when(repository).save(ninth);
        doNothing().when(repository).save(tenth);

        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOverMovieAdListLength() {
        MovieAdItem[] returned = new MovieAdItem[]{second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).save(fourth);
        doNothing().when(repository).save(fifth);
        doNothing().when(repository).save(sixth);
        doNothing().when(repository).save(seventh);
        doNothing().when(repository).save(eighth);
        doNothing().when(repository).save(ninth);
        doNothing().when(repository).save(tenth);
        doNothing().when(repository).save(eleventh);

        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddUnderMovieAdListLength() {
        MovieAdItem[] returned = new MovieAdItem[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).save(fourth);
        doNothing().when(repository).save(fifth);
        doNothing().when(repository).save(sixth);
        doNothing().when(repository).save(seventh);
        doNothing().when(repository).save(eighth);
        doNothing().when(repository).save(ninth);

        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

}









