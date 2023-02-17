import java.util.Random;
public class ServerNameGenerator {
    public static String[] nouns = {"Dog","Chair","Ocean","Tree","Book","Mountain","Car","Phone","Cake","Bicycle"};
    public static String[] adjectives = {"Beautiful","Happy"," Blue","  Exciting"," Smart"," Fast","Quiet"," Delicious","Cold","Dangerous"};

    public static String randomString(String[] array, String[] array1){

        Random random = new Random();
        int randomNumber1 = random.nextInt(10);
        int randomNumber2 = random.nextInt(10);
        System.out.println(randomNumber2);
        System.out.println(randomNumber1);
        return String.format("your server name is: %n%S %S",array[randomNumber1], array1[randomNumber2]);
    }

    public static void main(String[] args) {
        System.out.println(randomString(nouns, adjectives));

    }

}
















