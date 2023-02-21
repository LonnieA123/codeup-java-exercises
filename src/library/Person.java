package library;

abstract public class Person {

    private int age;
    private String job;
    private String favGenre;

    public void setAge(int age) {
        this.age = age;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setFavGenre(String favGenre) {
        this.favGenre = favGenre;
    }

    public int getAge() {
        return age;
    }
    public String getJob() {
        return job;
    }
    public String getFavGenre() {
        return favGenre;
    }

    public Person(int age, String job){
        this.age = age;
        this.job = job;
    }

    abstract public void readBook();


}
