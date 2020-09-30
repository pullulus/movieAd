package ru.netology.manager;

import ru.netology.domain.MovieAdItem;

public class MovieAdManager {

    private int movieAdListLength = 10;

    public MovieAdManager(int movieAdListLength) {
        this.movieAdListLength = movieAdListLength;
    }

    public MovieAdManager() {

    }

    private MovieAdItem[] items = new MovieAdItem[0];

    public void add(MovieAdItem item) {
        int length = items.length + 1;
        MovieAdItem[] tmp = new MovieAdItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieAdItem[] getAll() {
        int total = 0;
        if (items.length < movieAdListLength) {
            total = items.length;
        }
        if (items.length >= movieAdListLength) {
            total = movieAdListLength;
        }

        MovieAdItem[] result = new MovieAdItem[total];

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    }




