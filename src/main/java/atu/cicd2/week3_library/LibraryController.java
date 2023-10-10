package atu.cicd2.week3_library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class LibraryController {
    private LibraryService myLibraryService;

    @Autowired
    public void setMyLibraryService(LibraryService myLibraryService) {this.myLibraryService = myLibraryService; }

    @PostMapping("library/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerBook(@RequestBody Book book) {
        myLibraryService.addBook(book);
        myLibraryService.getBooks();
    }
}
