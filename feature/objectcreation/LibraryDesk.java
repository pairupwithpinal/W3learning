package feature.objectcreation;

import java.util.ArrayList;
import java.util.List;

public class LibraryDesk {

    public static void main(String[] args) {
        Book b1 = new Book("Jake","XYZ","001");
        Book b2 = new Book("Owl","Abc","123");
        Book b3 = new Book("Gita","Krishna","999");
        Book b4 = new Book("ALgebra","Piyu","222");

        Book b5 = new Book();

        List<Book> bookList = new ArrayList<Book>();

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);

        bookList.stream().forEach(book->System.out.println(book));

        System.out.println("b1:"+ b1);
        System.out.println("b2:"+ b2);
        System.out.println("b3:"+ b3);
        System.out.println("b4:"+ b4);


    }



}



