package library;
public class Book extends Media implements Identify{
    private String type;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    private int bookID;

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public Book(int rating, String author, String type){
        super(rating,author);
        this.type = type;
    }


    @Override
    public void identify() {
        System.out.println("this books title is " + this.getBookID() );
    }

    @Override
    public void SelectMedia() {
        System.out.println("this is a book will you read it?");
    }

}
