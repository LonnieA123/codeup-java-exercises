import java.util.Scanner;

public class Bob {

    public static void main(String[] args){
        System.out.println("hello");
<<<<<<< HEAD
=======
        do{
>>>>>>> origin/main
            Scanner scan = new Scanner(System.in);
            String response = scan.next();

            if(response.endsWith("!")){
                System.out.println("BROOOOO WHY U YELLLLLLLLLLL");

            }else if(response.endsWith("?")){
                System.out.println("ya i guess");

<<<<<<< HEAD
            }else if(response.equals("")){
=======
            }else if(response.isBlank()){
>>>>>>> origin/main
                System.out.println("fine be that WAY");

            }else if(response.equals("bye")){
                System.out.println("cya chump");

            }else{
                System.out.println("whatEVER");
            }

<<<<<<< HEAD
=======
        }while (true);





>>>>>>> origin/main

    }
}
