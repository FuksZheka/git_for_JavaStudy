package Knowledge_test;

public class LibraryException extends Exception {
    public LibraryException(String message){
        super(message);
    }
}
class BookNotFoundException extends LibraryException{
    public BookNotFoundException(Long Bookid){
        super("Book with id " + Bookid + "not found");
    }
}

class InvalidYearException extends LibraryException{
    public InvalidYearException (int year){
        super("Year" + year + "is invalid");
    }
}