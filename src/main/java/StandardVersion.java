import helpers.JsonHelper;
import models.*;

import java.io.IOException;
import java.util.ArrayList;


public class StandardVersion {
    public static void main(String[] args) throws IOException {
        // here you have example of creating library object using constructor
        Library library = new Library(new ArrayList<>() {{
            add(new Movie("The Shawshank Redemption",
                    Genre.DRAMA,
                    new Director("Frank", "Darabont"),
                    new ArrayList<>() {{
                        add(new Actor("Tim", "Robbins"));
                        add(new Actor("Morgan", "Freeman"));
                        add(new Actor("Bob", "Gunton"));
                    }}));
            add(new Movie("Seven",
                    Genre.THRILLER,
                    new Director("David", "Fincher"),
                    new ArrayList<>() {{
                        add(new Actor("Morgan", "Freeman"));
                        add(new Actor("Brad", "Pitt"));
                        add(new Actor("Gwyneth", "Paltrow"));
                    }}));
        }});

        System.out.println(library);

        // here is example how export object as json, open serializeJson method for implementation
        new JsonHelper().serializeJson("target/exportedMovies.json", library);
    }
}
