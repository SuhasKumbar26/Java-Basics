package Inheritance.Inheritance;

public class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;

    public void checkout(){
        System.out.println("checkout");
    }

    public void returnItem (){
        System.out.println("item returned");
    }

}
