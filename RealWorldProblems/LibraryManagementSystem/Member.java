package RealWorldProblems.LibraryManagementSystem;

import java.util.Date;
public class Member extends User {
    private Date dateOfMembership;
    private int totalBooksCheckedOut;

    public Member(String mem001, String pass, Person personMember, LibraryCard cardMember) {
        super();
    }

    public boolean reserveBookItem(BookItem bookItem) {
        return false;
    }
    private void incrementTotalBooksCheckedOut(){
        return ;
    }
    public boolean checkoutBookItem(BookItem bookItem){
        return false;
    }
    private void checkForFine(String bookItemId){
        return ;
    }
    public void returnBookItem(BookItem bookItem){
        return ;
    }
    public boolean renewBookItem(BookItem bookItem){
        return false;
    }
    public boolean resetPassword() {
        // definition
        return false;
    }





}
