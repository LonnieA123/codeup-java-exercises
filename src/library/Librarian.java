package library;

public class Librarian extends Person implements Identify{

    private String favGenre;
    @Override
    public String getFavGenre() {
        return favGenre;
    }
    @Override
    public void setFavGenre(String favGenre) {
        this.favGenre = favGenre;
    }

    private String legalName;

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }


    public Librarian(int age, String job, String favGenre,String legalName){
        super(age,job);
        this.favGenre = favGenre;
        this.legalName = legalName;
    }



    @Override
    public void readBook() {
        System.out.println("i love books");
    }

    @Override
    public void identify() {
        System.out.println("omg its " + this.legalName);
    }
}
