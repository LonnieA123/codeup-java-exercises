import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        Person[] people = {
                new Person("james"),
                new Person("lonnie"),
                new Person("bro")
        };

        Person self = new Person("self");
        System.out.println(addPerson(people, self));


    }

    public static Person[] addPerson(Person[] peopleArray, Person toAdd){
        Person[] newPeople = Arrays.copyOf(peopleArray,peopleArray.length + 1);
        newPeople[newPeople.length - 1] = toAdd;
        return newPeople;
    }



}
