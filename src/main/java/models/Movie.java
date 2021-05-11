package models;

import java.util.ArrayList;

public class Movie {
    private String title;
    private Director director;
    private ArrayList<Actor> actors;
    private Genre genre;

    public Movie() {

    }

    public Movie(String title, Genre genre, Director director, ArrayList<Actor> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie:" +
                "\r\n   Title - " + title +
                "\r\n   Director - " + director +
                "\r\n   Genre - " + genre.toString().toLowerCase() +
                "\r\n   Actors - " + actors +
                "\r\n";
    }
}
