package library;

abstract public class Media {
    private int rating;
    private String author;

    public int getRating() {
        return rating;
    }
    public String getAuthor() {
        return author;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


    public Media(int rating, String author){
        this.author = author;
        this.rating = rating;
    }


    public void recs(){
        if(this.rating > 3){
            System.out.println("this is a good choice");
        }
        else {
            System.out.println("this is an alright choice");
        }
    }
   abstract public void SelectMedia();

    public static void main(String[] args) {
        Book book = new Book(10,"ne","comedy");
        book.recs();
        book.SelectMedia();
    }
}