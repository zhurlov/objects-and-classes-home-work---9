public class Main {

 //  public static Book toWriteBook(String name, int publication) {
   //     Book book = new Book();
     //   book.name = name;
       // book. publication = publication;
        //return book;

    //}

    public static Author creativeFace(String name, String surname) {
        Author author = new Author();
        author.name = name;
        author.surname = surname;
        return author;
    }



    public static void main(String[] args) {
        //String name = "gregory";
       // int publication = 1988;
        String name, surname;
        name = "vyacheslav";
        surname = "grigoriev";


////////// Объект Книга.
        Book grigory = new Book("gregory",1988);
        //grigory.name = "grigory";
        System.out.println("grigory.name = " + grigory.getName());
        System.out.println(grigory.name);
        //grigory.publication = 1988;
        System.out.println("grigory.publication = " + grigory.getPublication());
        grigory.setPublication(2003);
        System.out.println("grigory.getPublication() = " + grigory.getPublication());




////////// Объект Автор.
        Author vyacheslav = creativeFace("vyacheslav", "grigoriev");
        //vyacheslav.name = "vyacheslav";
        //vyacheslav.surname = "grigoriev";
        System.out.println("Автор книги = " + vyacheslav.getName() + "." + vyacheslav.getSurname());
        System.out.println( "год издания " + grigory.getPublication() +", Автор книги " + vyacheslav.getName() + "." + vyacheslav.getSurname() );


    }


}