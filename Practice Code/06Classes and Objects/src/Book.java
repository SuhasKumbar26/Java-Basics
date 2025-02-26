public class Book {
    static int totalBooks;

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book (String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book (String isbn){
        this("TitleUnknown","AuthorUnknown",isbn);
    }

    public void bookBorrow(){
        if (isBorrowed){
            System.out.println("this book is Already borrowed..");
        } else {
            System.out.println("You borrowed book...");
            this.isBorrowed = true;
            totalBooks--;
        }
    }

    public void returnBook(){
        if (isBorrowed){
            System.out.println("Thank visit again..");
            this.isBorrowed = false;
            totalBooks++;
        } else {
            System.out.println("You can't return Book without Borrowing");
        }
    }

    public static void getTotalBooks(){
        System.out.println("Total no.of "+totalBooks);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Suhas@123");
        book1.returnBook();
        book1.bookBorrow();
        book1.returnBook();
        book1.returnBook();
        Book.getTotalBooks();
        System.out.println("-----------------");

        Book book2 = new Book("BookByMe","Suhas","Suh123k");
        book2.returnBook();
        book2.bookBorrow();
        book2.returnBook();
        book2.returnBook();
        Book.getTotalBooks();

    }
}
