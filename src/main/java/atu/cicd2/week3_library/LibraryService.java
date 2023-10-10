package atu.cicd2.week3_library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LibraryService {
    private ArrayList <Book> books;

    public LibraryService(){
        books = new ArrayList<Book> ();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println(book.getTitle() + " added to library");
    }

    public void getBooks(){
        for(Book book: books)
            System.out.println(book);
    }


}
