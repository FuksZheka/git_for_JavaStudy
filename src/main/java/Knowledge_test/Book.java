package Knowledge_test;

import java.util.List;
import java.util.stream.Collectors;

public class Book {
    public Book() {
    }

    private long id;
    private String title;
    private String author;
    private int year;

    public Book(long id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    private static List<Book> filterByYear(List<Book> inputlist, int year) {
        return inputlist.stream().
                filter(book -> book.year > year).
                collect(Collectors.toList());
    }


}
