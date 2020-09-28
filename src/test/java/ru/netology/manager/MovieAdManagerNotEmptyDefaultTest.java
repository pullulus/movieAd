package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieAdItem;

import static org.junit.jupiter.api.Assertions.*;

public class MovieAdManagerNotEmptyDefaultTest {

    MovieAdManager manager = new MovieAdManager();
    MovieAdItem first = new MovieAdItem(1, "Bloodshot", "superhero film", "29.05.2020");
    MovieAdItem second = new MovieAdItem(2, "Onward", "animated film", "05.03.2020");
    MovieAdItem third = new MovieAdItem(3, "Hotel Belgrad", "comedy", "05.03.2020");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }

    @Test
    public void shouldAddMovieAdListLength() {

        MovieAdItem fourth = new MovieAdItem(4, "The Gentlemen", "action comedy", "13.02.2020");
        MovieAdItem fifth = new MovieAdItem(5, "The Invisible Man", "science fiction horror", "05.03.2020");
        MovieAdItem sixth = new MovieAdItem(6, "Trolls World Tour", "animated film", "19.03.2020");
        MovieAdItem seventh = new MovieAdItem(7, "Tenet", "action-thriller", "03.09.2020");
        MovieAdItem eighth = new MovieAdItem(8, "Mulan", "action drama", "03.09.2020");
        MovieAdItem ninth = new MovieAdItem(9, "Malasana", "horror","17.09.2020");
        MovieAdItem tenth = new MovieAdItem(10, "Antebellum", "horror","17.09.2020");
        MovieAdItem eleventh = new MovieAdItem(11, "Re loca", "comedy", "24.09.2020");
        MovieAdItem  twelfth = new MovieAdItem(12, "Greenland", "apocalyptic action", "20.08.2020");
        MovieAdItem thirteenth = new MovieAdItem(13, "The Nest", "thriller", "24.09.2020");

        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        manager.add(thirteenth);


        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOverMovieAdListLength() {

        MovieAdItem fourth = new MovieAdItem(4, "The Gentlemen", "action comedy", "13.02.2020");
        MovieAdItem fifth = new MovieAdItem(5, "The Invisible Man", "science fiction horror", "05.03.2020");
        MovieAdItem sixth = new MovieAdItem(6, "Trolls World Tour", "animated film", "19.03.2020");
        MovieAdItem seventh = new MovieAdItem(7, "Tenet", "action-thriller", "03.09.2020");
        MovieAdItem eighth = new MovieAdItem(8, "Mulan", "action drama", "03.09.2020");
        MovieAdItem ninth = new MovieAdItem(9, "Malasana", "horror","17.09.2020");
        MovieAdItem tenth = new MovieAdItem(10, "Antebellum", "horror","17.09.2020");
        MovieAdItem eleventh = new MovieAdItem(11, "Re loca", "comedy", "24.09.2020");
        MovieAdItem  twelfth = new MovieAdItem(12, "Greenland", "apocalyptic action", "20.08.2020");
        MovieAdItem thirteenth = new MovieAdItem(13, "The Nest", "thriller", "24.09.2020");
        MovieAdItem fourteenth = new MovieAdItem(14, "Never Rarely Sometimes Always", "drama","17.09.2020");

        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        manager.add(thirteenth);
        manager.add(fourteenth);


        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{fourteenth, thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddUnderMovieAdListLength() {

        MovieAdItem fourth = new MovieAdItem(4, "The Gentlemen", "action comedy", "13.02.2020");
        MovieAdItem fifth = new MovieAdItem(5, "The Invisible Man", "science fiction horror", "05.03.2020");
        MovieAdItem sixth = new MovieAdItem(6, "Trolls World Tour", "animated film", "19.03.2020");
        MovieAdItem seventh = new MovieAdItem(7, "Tenet", "action-thriller", "03.09.2020");
        MovieAdItem eighth = new MovieAdItem(8, "Mulan", "action drama", "03.09.2020");


        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);


        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

}









