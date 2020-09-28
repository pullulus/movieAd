package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieAdItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieAdManagerWithOneTest {

    MovieAdManager manager = new MovieAdManager(15);
    MovieAdItem first = new MovieAdItem(1, "Bloodshot", "superhero film", "29.05.2020");

    @BeforeEach
    public void setUp() {
        manager.add(first);
    }

    @Test
    public void shouldAddMovieAdListLength() {

        MovieAdItem second = new MovieAdItem(2, "Greenland", "apocalyptic action", "20.08.2020");
        MovieAdItem third = new MovieAdItem(3, "The Nest", "thriller", "24.09.2020");
        MovieAdItem fourth = new MovieAdItem(4, "The Gentlemen", "action comedy", "13.02.2020");
        MovieAdItem fifth = new MovieAdItem(5, "The Invisible Man", "science fiction horror", "05.03.2020");
        MovieAdItem sixth = new MovieAdItem(6, "Trolls World Tour", "animated film", "19.03.2020");
        MovieAdItem seventh = new MovieAdItem(7, "Tenet", "action-thriller", "03.09.2020");
        MovieAdItem eighth = new MovieAdItem(8, "Mulan", "action drama", "03.09.2020");
        MovieAdItem ninth = new MovieAdItem(9, "Malasana", "horror", "17.09.2020");
        MovieAdItem tenth = new MovieAdItem(10, "Antebellum", "horror", "17.09.2020");
        MovieAdItem eleventh = new MovieAdItem(11, "Re loca", "comedy", "24.09.2020");
        MovieAdItem  twelfth = new MovieAdItem(12, "Never Rarely Sometimes Always", "drama","17.09.2020");
        MovieAdItem  thirteenth = new MovieAdItem(13, "Turu, the Wacky Hen", "animated film", "17.09.2020");
        MovieAdItem fourteenth = new MovieAdItem(14, "Made in Italy", "comedy", "24.09.2020");
        MovieAdItem  fifteenth = new MovieAdItem(15, "The New Mutants", "horror", "03.09.2020");
        MovieAdItem sixteenth= new MovieAdItem(16, "Undine", "romance","24.09.2020");

        manager.add(second);
        manager.add(third);
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
        manager.add(fifteenth);
        manager.add(sixteenth);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{sixteenth, fifteenth, fourteenth, thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovieAdOverListLength() {

        MovieAdItem second = new MovieAdItem(2, "Greenland", "apocalyptic action", "20.08.2020");
        MovieAdItem third = new MovieAdItem(3, "The Nest", "thriller", "24.09.2020");
        MovieAdItem fourth = new MovieAdItem(4, "The Gentlemen", "action comedy", "13.02.2020");
        MovieAdItem fifth = new MovieAdItem(5, "The Invisible Man", "science fiction horror", "05.03.2020");
        MovieAdItem sixth = new MovieAdItem(6, "Trolls World Tour", "animated film", "19.03.2020");
        MovieAdItem seventh = new MovieAdItem(7, "Tenet", "action-thriller", "03.09.2020");
        MovieAdItem eighth = new MovieAdItem(8, "Mulan", "action drama", "03.09.2020");
        MovieAdItem ninth = new MovieAdItem(9, "Malasana", "horror", "17.09.2020");
        MovieAdItem tenth = new MovieAdItem(10, "Antebellum", "horror", "17.09.2020");
        MovieAdItem eleventh = new MovieAdItem(11, "Re loca", "comedy", "24.09.2020");
        MovieAdItem  twelfth = new MovieAdItem(12, "Never Rarely Sometimes Always", "drama","17.09.2020");
        MovieAdItem  thirteenth = new MovieAdItem(13, "Turu, the Wacky Hen", "animated film", "17.09.2020");
        MovieAdItem fourteenth = new MovieAdItem(14, "Made in Italy", "comedy", "24.09.2020");
        MovieAdItem  fifteenth = new MovieAdItem(15, "The New Mutants", "horror", "03.09.2020");
        MovieAdItem sixteenth= new MovieAdItem(16, "Undine", "romance","24.09.2020");
        MovieAdItem  seventeenth = new MovieAdItem(17, "Rogue", "action", "17.09.2020");
        MovieAdItem eighteenth = new MovieAdItem(18, "Houl's Moving Castle", "animated fantasy", "25.09.2005");
        MovieAdItem nineteenth = new MovieAdItem(19, "The Assistant", "thriller", "10.09.2020");
        MovieAdItem twentieth = new MovieAdItem(20, "Escape from Pretoria", "thriller", "01.09.2020");

        manager.add(second);
        manager.add(third);
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
        manager.add(fifteenth);
        manager.add(sixteenth);
        manager.add(seventeenth);
        manager.add(eighteenth);
        manager.add(nineteenth);
        manager.add(twentieth);

        MovieAdItem[] actual = manager.getAll();
        MovieAdItem[] expected = new MovieAdItem[]{twentieth, nineteenth, eighteenth, seventeenth, sixteenth, fifteenth, fourteenth, thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovieAdUnderListLength() {

        MovieAdItem second = new MovieAdItem(2, "Greenland", "apocalyptic action", "20.08.2020");
        MovieAdItem third = new MovieAdItem(3, "The Nest", "thriller", "24.09.2020");
        MovieAdItem fourth = new MovieAdItem(4, "The Gentlemen", "action comedy", "13.02.2020");
        MovieAdItem fifth = new MovieAdItem(5, "The Invisible Man", "science fiction horror", "05.03.2020");
        MovieAdItem sixth = new MovieAdItem(6, "Trolls World Tour", "animated film", "19.03.2020");
        MovieAdItem seventh = new MovieAdItem(7, "Tenet", "action-thriller", "03.09.2020");
        MovieAdItem eighth = new MovieAdItem(8, "Mulan", "action drama", "03.09.2020");
        MovieAdItem ninth = new MovieAdItem(9, "Malasana", "horror", "17.09.2020");


        manager.add(second);
        manager.add(third);
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
