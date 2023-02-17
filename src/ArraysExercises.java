import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        Person[] people = {
                new Person("james"),
                new Person("lonnie"),
                new Person("bro")
        };

        for(Person person : people){
            System.out.println(person.getName());
        }


        Person self = new Person("self");
        people = Person.addPerson(people, self);


        for(Person person : people){
            System.out.println(person.getName());
        }


    }


//    public static Person[] addPerson(Person[] peopleArray, Person toAdd){
//        Person[] newPeople = Arrays.copyOf(peopleArray,peopleArray.length + 1);
//        newPeople[newPeople.length - 1] = toAdd;
//        return newPeople;
//    }



}
