import java.util.*;


public class MethodsExercises {

    public static void main(String[] args){


    }

    static class ArithmeticSample {
        public static void main(String[] args) {
            int x = 5 * 4 % 3;
            System.out.println(x);
        }}

    public static class TernaryTester {
     public static void main(String[] args) {
                     int x = 5;
                    System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
                 }
 }



    public static int randoms(int min, int max){
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    static int random = randoms(0,100);



    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ",min, max);
        int num = Integer.parseInt(scan.nextLine());


        if (num > min && num < max){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
            int booboo = getInteger(min,max);
        }
        return num;
    };



    public static void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.println("how long do u want this");
        int length = scan.nextInt();
        int factor = 1;
        for (int i = 1; i <= length; i++){
            factor = factor * i;
            System.out.println(i + "! = " + i + "x" + i + " = " + factor);
        }

    }



    public static void dice() {
        String confirm;

            Scanner scan = new Scanner(System.in);
            System.out.println("how many sides of the dice");
            int num = Integer.parseInt(scan.nextLine());
            System.out.println("rolling dice");
            System.out.println(randoms(0, num));

            System.out.println("would you like to continue Y/N");
            confirm = scan.nextLine();
            confirm.equals("y");


    };






    public static String higherOrLower(){
        System.out.println(random);

        Scanner scan = new Scanner(System.in);
        System.out.println("guess a number");

        int guess = Integer.parseInt(scan.nextLine());

        if (guess > random){
            System.out.println("lower");
            String nope = higherOrLower();


        }else if (guess < random){
            System.out.println("higher");
            String nope = higherOrLower();

        }else {
            System.out.println("you got it");
        }

        return "great job!";
    };





    // TODO: use recursion to print out a given number up through 100

    public static void count(int num){
        if(num == 101){
            System.out.println("All done!");
            return;
        }
        System.out.println(num);
        count(num + 1);
    }


    // TODO: use recursion to print letters of a string starting with the first and ending with the last
    //  (each call will work on a smaller substring)


    // TODO: use recursion to add all numbers up from 1 to a given number



    // BONUS TODO: use recursion to write a factorial method (very similar to the third todo)

    // BONUS TODO: use recursion to reverse the characters in a string




    public static int multiplyTheDumbWay(int num1, int times){

        for (int i = 1; i < times; i++){
            num1 += num1;

        }
        return num1;
    };


    public static String sayName(String name){
        return "Hello" + name;
    };

    public static String sayName(String name, String lastname){
        return "Hello " + name + " "+ lastname;
    };


}
