import helpers.JsonHelper;
import models.Library;

import java.io.IOException;


public class JsonVersion {
    public static void main(String[] args) throws IOException {
        Library library = new JsonHelper().deserializeJson("src/main/resources/movies.json", Library.class);
        System.out.println(library);
    }
}
