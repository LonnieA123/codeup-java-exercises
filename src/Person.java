public class Person {

    private String name;

    public void setName(String nameInput){
        this.name = nameInput;
    }

    public String getName(){
        return this.name;
    }

    public Person(String name){
        this.name = name;
    }




    public static void main(String[] args) {
        Person person1 = new Person("John");



    }




}
