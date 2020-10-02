package ru.netology.manager;

import ru.netology.domain.MovieAdItem;
import ru.netology.repository.MovieAdRepository;

public class MovieAdManager {

    private int movieAdListLength = 10;

    public MovieAdManager(int movieAdListLength) {
        this.movieAdListLength = movieAdListLength;
    }

    public MovieAdManager() {

    }

    private MovieAdRepository repository;

    public MovieAdManager (MovieAdRepository repository) {
        this.repository = repository;
    }

    public void add(MovieAdItem item) {
        repository.save(item);
    }

    public MovieAdItem[] getAll() {
        MovieAdItem[] items = repository.findAll();
        MovieAdItem[] tmp = new MovieAdItem[items.length];
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

    public void removeById(int id) {
        repository.removeById(id);
    }

    }




