package RealWorldProblems.LibraryManagementSystem;

public class Library
{
    public Catalog catalog;
    private String name;
    private Address address;

    // Private constructor to prevent external instantiation
    private Library() {}

    public static Library getInstance(String springfieldPublicLibrary, Address libAddress) {
        return null;
    }

    public Address getAddress() {
        return null;
    }

    // The Library is a singleton class that ensures it will have only one active instance at a time
    private static Library library = null;

    // Created a static method to access the singleton instance of Library class
    public static Library getInstance ()
    {
        if (library == null)
        {
            library = new Library ();
        }
        return library;
    }
}
