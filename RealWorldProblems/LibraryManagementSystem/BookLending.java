package RealWorldProblems.LibraryManagementSystem;

import java.util.Date;

public class BookLending {
    private String itemId;
    private String memberId;
    private User user;
    private Date creationDate;
    private Date dueDate;
    private Date returnDate;
    private BookReservation bookReservation;


    public static boolean lendBook(String bookItemId, String memberId) {
        return false;
    }

    public static BookLending fetchLendingDetails(String bookItemId) {
        return null;
    }
}


