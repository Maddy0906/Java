package Java.Practice12;

/**
 * Created by madoka on 2017/05/10.
 */
public class Book extends TangibleAsset {
    private String isbn;

    //constructor
    public Book(String name, int price, String color, String isbn){
        super(name,price,color);
        this.isbn = isbn;
    }

    //getter

    public String getIsbn() {
        return isbn;
    }
}


