public class Main {

    //  public static Book toWriteBook(String name, int publication) {
    //     Book book = new Book();
    //   book.name = name;
    // book. publication = publication;
    //return book;

    //}

    //public static Author creativeFace(String name, String surname) {
    //Author author = new Author();
    //author.name = name;
    //author.surname = surname;
    //return author;
    //}


    public static void main(String[] args) {
        //String name = "gregory";
        // int publication = 1988;
        //String name, surname;
        //name = "vyacheslav";
        //surname = "grigoriev";

////////// Объект Автор.
        Author vyacheslav = new Author("vyacheslav", "grigoriev");
        //vyacheslav.name = "vyacheslav";
        //vyacheslav.surname = "grigoriev";
        System.out.println("автор книги - " + vyacheslav.getName() + "." + vyacheslav.getSurname());
        //System.out.println("год издания " + grigory.getPublication() + ", Автор книги " + vyacheslav.getName() + "." + vyacheslav.getSurname());

////////// Объект Книга.
        Book grigory = new Book("smart student", vyacheslav ,1988);
        //grigory.name = "grigory";
        //grigory.publication = 1988;
        grigory.setPublication(2003);
        System.out.println( "книга " + grigory.getName() + " автор "  + vyacheslav.getName() + " " + vyacheslav.getSurname() + " ,опубликована в " + grigory.getPublication() + "г.");

    }

}


