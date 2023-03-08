public class ArraysExercises {

    public static void main(String[] args) {

        Person1[] people = {
                new Person1("james"),
                new Person1("lonnie"),
                new Person1("bro")
        };

        for(Person1 person : people){
            System.out.println(person.getName());
        }


        Person1 self = new Person1("self");
        people = Person1.addPerson(people, self);


        for(Person1 person : people){
            System.out.println(person.getName());
        }


    }


//    public static Person[] addPerson(Person[] peopleArray, Person toAdd){
//        Person[] newPeople = Arrays.copyOf(peopleArray,peopleArray.length + 1);
//        newPeople[newPeople.length - 1] = toAdd;
//        return newPeople;
//    }



}
