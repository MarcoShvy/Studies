package projeto002.entites;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Coments comment1= new Coments("hava a nice trip");
        Coments comment2= new Coments("Wow thats awesome!");
        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Travelling to new zealand", "i'm going to visit this wonderful country", 12);
        post1.addComment(comment1);
        post1.addComment(comment2);

    }
}
