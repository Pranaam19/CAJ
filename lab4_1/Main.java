package lab4_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book1> books = new ArrayList<>();
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("David","David@gamil.com",'M'));
        authors.add(new Author("John","Doe@hotmail.com",'M'));
        authors.add(new Author("Jane","jane@yahoo.in",'F'));
        Author a = new Author("Jack","jack@gamil.com",'M');

        Author jane = authors.get(2);
        Author John = authors.get(1);
        books.add(new Book1("AgathaCristi",jane, 12000.0,12));
        Book1 book2 = new Book1("The Algo",John, 1200.0,34);
        Book1 book3 = books.get(0);

//        assert(book2.getAuthor().getName().equals("David"));
//        assert book2.getName().equals("AgathaCristi") :"Not the right book";
        System.out.println(book2);
        System.out.println(a);

    }
}
