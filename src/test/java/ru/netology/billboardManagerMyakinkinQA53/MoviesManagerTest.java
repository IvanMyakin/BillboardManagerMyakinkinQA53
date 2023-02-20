package ru.netology.billboardManagerMyakinkinQA53;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesManagerTest {

    @Test
    public void addMoviesTest() {

        MoviesManager manager = new MoviesManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneMoviesTest() {

        MoviesManager manager = new MoviesManager();

        manager.add("Film I");


        String[] expected = {"Film I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addTwoMoviesTest() {

        MoviesManager manager = new MoviesManager();

        manager.add("Film I");
        manager.add("Film II");


        String[] expected = {"Film I", "Film II"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMaxMoviesTest() {

        MoviesManager manager = new MoviesManager();

        for (int i = 0; i < 10; i++) {
            int j = i + 1;
            manager.add("Film " + j);
        }

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoviesFindLastMaxTest() {

        MoviesManager manager = new MoviesManager();

        manager.add("Film III");

        String[] expected = {"Film III"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoviesFindLastMoreMaximumTest() {

        MoviesManager manager = new MoviesManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");

        String[] expected = {"Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoviesFindLastLessMaximumTest() {

        MoviesManager manager = new MoviesManager();

        manager.add("Film I");
        manager.add("Film II");


        String[] expected = {"Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoviesFindLastEqualMaximumTest() {

        MoviesManager manager = new MoviesManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}