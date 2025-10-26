package RealWorldProblems.LibraryManagementSystem;

public class Librarian extends User {

    public Librarian(String lib001, String pass, Person personLibrarian, LibraryCard cardLibrarian) {
        super();
    }

    public boolean blockMember(Member member){return false;};
    public boolean unBlockMember(Member member){return false;};
    public boolean resetPassword() {
        return false;
    }
    public boolean addBookItem(BookItem bookItem) {
        return false;
    }

}