package ru.netology.repository;

import ru.netology.domain.MovieAdItem;

public class MovieAdRepository {
    private MovieAdItem[] items = new MovieAdItem[0];

    public void save(MovieAdItem item) {
    int length = items.length +1;
    MovieAdItem[] tmp = new MovieAdItem[length];
    System.arraycopy(items, 0, tmp, 0, items.length);
    int lastIndex = tmp.length -1;
    tmp[lastIndex] = item;
    items = tmp;
    }

    public MovieAdItem[] findAll() {
        return items;
    }

    public void findById(int id) {

            for(MovieAdItem item :items) {
            if(item.getId() == id) {
                
            }
        }
    }

    public void removeById(int id) {
        int length = items.length-1;
        MovieAdItem[] tmp = new MovieAdItem[length];
        int index = 0;
        for(MovieAdItem item : items) {
            if(item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }
}
