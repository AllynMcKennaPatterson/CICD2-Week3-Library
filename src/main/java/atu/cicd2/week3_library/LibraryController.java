package atu.cicd2.week3_library;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    private LibraryService myLibraryService;



    @PostMapping("library")
    @ResponseStatus(HttpStatus.CREATED)
    public Book registerBook(@RequestBody Book book) {

    }
}
