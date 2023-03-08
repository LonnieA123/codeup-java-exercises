import java.util.Arrays;

public class Person1 {

    private String name;

    public void setName(String nameInput){
        this.name = nameInput;
    }

    public String getName(){
        return this.name;
    }

    public Person1(String name){
        this.name = name;
    }

    public static Person1[] addPerson(Person1[] peopleArray, Person1 toAdd){
        Person1[] newPeople = Arrays.copyOf(peopleArray,peopleArray.length + 1);
        newPeople[newPeople.length - 1] = toAdd;
        return newPeople;
    }


    public static void main(String[] args) {
        Person1 person1 = new Person1("John");

    }






}
