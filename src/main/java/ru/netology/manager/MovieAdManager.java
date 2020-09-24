package ru.netology.manager;

import ru.netology.domain.Addition;
import ru.netology.domain.MovieAdItem;

public class MovieAdManager {

    private MovieAdItem[] items = new MovieAdItem[0];


    public void add(MovieAdItem item) {
        int length = items.length +1;
        MovieAdItem[] tmp = new MovieAdItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieAdItem[] getAll() {
        MovieAdItem[] result = new MovieAdItem[items.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }


    private Addition[] additions = new Addition[0];



    public void addAddition(Addition addition) {
        int length = additions.length +1;
        Addition[] tmp = new Addition[length];

        System.arraycopy(additions, 0, tmp, 0, additions.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = addition;
        additions = tmp;
    }

    public Addition[]  getAllAdditions() {
        Addition[] result = new Addition[additions.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = additions.length - i - 1;
            result[i] = additions[index];
        }
        return result;
    }


    }


