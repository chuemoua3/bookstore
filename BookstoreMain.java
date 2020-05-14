

public class BookstoreMain{

    public static void main(String[] args){
        BookStore bookstore = new BookStore ("Books & Books", "123 Tryon St.", 3500, true);

        System.out.println("\nWhat is the address of the bookstore?");
        System.out.println(bookstore.getName());
        System.out.println(bookstore.getAddress());

        System.out.println("\nWhat time does the bookstore open?");
        System.out.println(bookstore.getOpen());

        System.out.println("\nWhat time does the bookstore close?");
        System.out.println(bookstore.getClose());

        System.out.println("\nHow big is the store?");
        System.out.println(bookstore.getSqFt() + " sq ft");

        System.out.println("\nDoes the store have used or new books?");
        System.out.println(bookstore.isHasUsedBooks() ? "Both":"New");


        
    }




}