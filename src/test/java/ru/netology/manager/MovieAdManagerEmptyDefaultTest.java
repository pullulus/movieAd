package ru.netology.manager;

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
public class MovieAdManagerEmptyDefaultTest {
    @Mock
    private MovieAdRepository repository;
    @InjectMocks
    private MovieAdManager manager;

    @Test
    public void shouldGetAll() {

        MovieAdItem[] returned = new MovieAdItem[0];
        doReturn(returned).when(repository).findAll();


        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[0];

        assertArrayEquals(expected, actual);
    }

    }
