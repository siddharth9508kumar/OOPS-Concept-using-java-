public class Book {

    String title;
    String author;
    int price;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void print() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.print();

        Book book2 = new Book("The Time Machine", "H. G. Wells");
        book2.print();

        Book book3 = new Book("The Alchemist", "Paulo Coelho", 499);
        book3.print();
    }
}
