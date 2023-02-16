import java.util.Random;
public class ServerNameGenerator {
    public static String[] nouns = {"Dog","Chair","Ocean","Tree","Book","Mountain","Car","Phone","Cake","Bicycle"};
    public static String[] adjectives = {"Beautiful","Happy"," Blue","  Exciting"," Smart"," Fast","Quiet"," Delicious","Cold","Dangerous"};

    public static String randomString(String[] array, String[] array1){
        Random random = new Random();
        int randomNumber = random.nextInt(9);
        int randomNumber1 = random.nextInt(9);
        return String.format("your server name is %n%s -%s",array[randomNumber], array1[randomNumber1]);

    }


    public static void main(String[] args) {

        System.out.println(randomString(nouns, adjectives));

    }

}
















