package ProjectBook;

public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book(String title, String author, int releaseDate, int pages, String publisher, String isbn){
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
        this. isbn = isbn;
    }

    void description(){
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nRelase base: " + releaseDate + "\nPages: "
        + pages + "\nPublisher: " + publisher + "\nISBN: " + isbn + "\n--------------------------------------------");
    }
}
