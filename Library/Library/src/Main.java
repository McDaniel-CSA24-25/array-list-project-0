import java.util.ArrayList;
import java.util.*;



public class Main {

    public static void main(String[] args){
        ArrayList<Book> library = new ArrayList<>();

        while (true) {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("---------------\n");
            System.out.println("Type a something out to start entering a book into the database.");
            System.out.println("Enter the number of a book instead to check out the book.");
            System.out.println("Name of book: ");
            String nob = keyboard.nextLine();
            System.out.println("Author of book: ");
            String aut = keyboard.nextLine();

            Book newBook = new Book(nob, aut, true);
            boolean bookAlrExists = false;

            for (int i = 0; i < library.size(); i++){
                Book name = library.get(i);
                String bookName = name.getTitle();
                String bookAuthor = name.getAuthor();
                boolean bookAvailability = name.getAvailability();
                if (nob.equals(bookName) && aut.equals(bookAuthor)){
                    bookAlrExists = true;
                    name.setAvailability(!bookAvailability);
                }
            }

            if (!bookAlrExists) {
                library.add(newBook);
                bookAlrExists = false;
            }

            System.out.println("\nDATABASE:");
            System.out.println("---------------\n");

            for (int i = 0; i < library.size(); i++){
                Book name = library.get(i);
                String bookName = name.getTitle();
                String bookAuthor = name.getAuthor();
                boolean bookAvailability = name.getAvailability();
                System.out.println("Book " + (i+1) + ": ");
                System.out.println("Title: " + bookName);
                System.out.println("Author: " + bookAuthor);
                System.out.println("Is Available: " + bookAvailability + "\n");

            }
        }
    }

}



