import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int publication;



    public Book(String name, Author author ,int publication ) {
        this.name = name;
        this.author = author;
        this.publication = publication;
    }

    public String getName() {return this.name;}

    public int getPublication() {return this.publication;}

    public Author getAuthor() { return this.author; }

    public void setPublication(int publication) {this.publication = publication;}

    public String toString() {
        return "книга " + getName() + " автор " + getAuthor().getName() +" " + getAuthor().getSurname()  + " год издательства " +getPublication() + "г";
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return  false;
        Book book = (Book) object;
        return book.equals(book.name) && book.equals(book.author) && book.publication == publication && Objects.equals(name, book.name);
    }

    public int hashCode() {
        return Objects.hash(name, author, publication, name);
    }

}
