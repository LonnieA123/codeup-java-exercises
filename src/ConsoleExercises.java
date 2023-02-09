import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){

        double pi = 3.14159;
        System.out.println("The Value of Pi is " + pi);

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

        System.out.println("give me the length and width your room");
        float length = Integer.parseInt(scanner.nextLine());
        float width = Integer.parseInt(scanner.nextLine());
        System.out.println("the Area is " + (length * width));
        System.out.println("The perimeter is " + ((length  * 2) + (width * 2)));
    }
}
