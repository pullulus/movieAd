package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Addition;
import ru.netology.domain.MovieAdItem;

import static org.junit.jupiter.api.Assertions.*;

public class MovieAdManagerTestNotEmpty {

    @Test
    public void shouldAdd() {

    MovieAdManager manager = new MovieAdManager();

        MovieAdItem first = new MovieAdItem(1, "Bloodshot", "superhero film", "29.05.2020");
        MovieAdItem second = new MovieAdItem(2, "Onward", "animated film", "05.03.2020");
        MovieAdItem third = new MovieAdItem(3, "Hotel Belgrad", "comedy", "05.03.2020");

        manager.add(first);
        manager.add(second);
        manager.add(third);

        MovieAdItem fourth = new MovieAdItem(1, "The Gentlemen", "action comedy", "13.02.2020");

        manager.add(fourth);


        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{fourth,third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllAdditions() {

        MovieAdManager manager = new MovieAdManager();

        Addition first = new Addition(1, "The Gentlemen", "action comedy", "13.02.2020");
        Addition second = new Addition(2, "The Invisible Man", "science fiction horror", "05.03.2020");
        Addition third = new Addition(3, "Trolls World Tour", "animated film", "19.03.2020");
        Addition fourth = new Addition(4, "Number One", "comedy", "19.03.2020");

        manager.addAddition(first);
        manager.addAddition(second);
        manager.addAddition(third);
        manager.addAddition(fourth);

        manager.getAllAdditions();
        Addition[] actual = manager.getAllAdditions();
        Addition[] expected = new Addition[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);

    }

    }

