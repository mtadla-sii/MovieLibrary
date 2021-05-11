package models;

import java.util.ArrayList;

public class Movie {
    private String title;
    private Director director;
    private ArrayList<Actor> actors;
    private String genre;

    public Movie(){

    }
    public Movie(String title, Director director, ArrayList<Actor> actors, String genre) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.genre = genre;
    }
}
