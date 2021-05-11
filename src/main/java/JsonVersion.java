import helpers.JsonHelper;
import models.Library;

import java.io.IOException;


public class JsonVersion {
    public static void main(String[] args) throws IOException {
        // here you have example of deserializing json to object, open deserializeJson method to see implementation
        Library library = new JsonHelper().deserializeJson("src/main/resources/movies.json", Library.class);
        System.out.println(library);
    }
}
