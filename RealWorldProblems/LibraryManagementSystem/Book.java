package RealWorldProblems.LibraryManagementSystem;

import java.util.Date;
import java.util.List;

public  class Book {
    public Date publicationDate;
    private String isbn;
    private String title;
    private List<Author> authors;
    private String subject;
    private BookFormat bookFormat;
    private String language;
    private int numberOfPages;
    private String publisher;

    public <T> Book(String isbn123, String prideAndPrejudice, String novel, String publisherA, Date parse, String english, int i, BookFormat bookFormat, List<T> list) {
    }
}
