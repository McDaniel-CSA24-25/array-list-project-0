import java.util.ArrayList;
import java.util.Scanner;

public class Book{

    private String title;
    private String author;
    private boolean isAvailable;

    public Book() {
        title = "Untitled Book";
        author = "John Doe";
        isAvailable = true;
    }

    public Book(String t, String auth, boolean iA) {
        title = t;
        author = auth;
        isAvailable = iA;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean getAvailability(){
        return isAvailable;
    }

    public void setAvailability(boolean val){
        isAvailable = val;
    }



}