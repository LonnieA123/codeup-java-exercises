import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){

//        double pi = 3.14159;
//        System.out.printf("The Value of Pi is  %.2f.", pi );

        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a number");
//        int num = scanner.nextInt();
//        System.out.println("your age " + num);

//            System.out.println("enter 3 words");
//            String word1 = scanner.next();
//            String word2 = scanner.next();
//            String word3 = scanner.next();
//            System.out.println(word1 +  word2 + word3);

//                System.out.println("enter a sentence");
//                String word1 = scanner.nextLine();
//                System.out.println(word1);

//        System.out.println("give me the length and width your room");
//        float length = Float.parseFloat(scanner.nextLine());
//        float width = Float.parseFloat(scanner.nextLine());
//
//        System.out.println("the Area is " + (length * width));
//        System.out.println("The perimeter is " + ((length  * 2) + (width * 2)));
//


        System.out.println("give me the length and width your room");
        float length = Float.parseFloat(scanner.nextLine());
        float width = Float.parseFloat(scanner.nextLine());

        System.out.println("the Area is " + (length * width));
        System.out.println("The perimeter is " + (length + width) * 2);

        scanner.useDelimiter("/n");
    }
}
