import java.util.Arrays;

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

    public static Person[] addPerson(Person[] peopleArray, Person toAdd){
        Person[] newPeople = Arrays.copyOf(peopleArray,peopleArray.length + 1);
        newPeople[newPeople.length - 1] = toAdd;
        return newPeople;
    }


    public static void main(String[] args) {
        Person person1 = new Person("John");

    }






}
