package atu.cicd2.week3_library;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    String title;
    String author;
    String isbn;
    int publishedYear;
}
