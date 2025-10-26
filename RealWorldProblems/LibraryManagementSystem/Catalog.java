package RealWorldProblems.LibraryManagementSystem;


import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Catalog implements Search {
    private HashMap<String, List<Book>> bookTitles;
    private HashMap<String, List<Book>> bookAuthors;
    private HashMap<String, List<Book>> bookSubjects;
    private HashMap<String, List<Book>> bookPublicationDates;

    public List<Book> searchByTitle(String query) {
        // definition
        return null;
    }

    public List<Book> searchByAuthor(String query) {
        // definition
        return null;
    }

    public List<Book> searchBySubject(String query) {
        // definition
        return null;
    }

    public List<Book> searchByPublicationDate(Date date) {
        // definition
        return null;
    }

    public void addBookItem(BookItem bookItem1) {
    }
}