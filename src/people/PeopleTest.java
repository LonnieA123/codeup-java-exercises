package people;

public class PeopleTest {
    public static void main(String[] args) {
        People lonnie = new People("lonnie", "arellano",18,1500,true);
        People joey = new People("joey", "arellano",42,1500000,false);
        People andres = new People("andres", "arellano",12,0,true);
        People uhh = new People();

        System.out.println(lonnie.lifeSummary());
        System.out.println(uhh.lifeSummary());

        System.out.println(PeopleTools.rURich(joey));
    }



}
