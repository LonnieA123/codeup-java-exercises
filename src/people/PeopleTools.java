package people;
public class PeopleTools {

    public static String rURich(People people){
        int rich = 10000;
        if(people.getBankBalance() > rich){
            return String.format("u have %.2f u r so rich",people.getBankBalance());
        } else {
            return String.format("u only have %.2f LOL",people.getBankBalance());
        }
    }



}
