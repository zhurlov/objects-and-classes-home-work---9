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


}
