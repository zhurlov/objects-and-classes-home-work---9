public class Book {
private String name;
private int publication;
private String author;


    public Book(String name, String author ,int publication ) {
        this.name = name;
        this.author = author;
        this.publication = publication;
    }

    public String getName() {return this.name;}

    public int getPublication() {return this.publication;}

    public String getAuthor() { return this.author; }

    public void setPublication(int publication) {this.publication = publication;}


}
