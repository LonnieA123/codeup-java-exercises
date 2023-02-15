import java.util.Scanner;

public class Bob {

    public static void main(String[] args){
        System.out.println("hello");
            Scanner scan = new Scanner(System.in);
            String response = scan.next();

            if(response.endsWith("!")){
                System.out.println("BROOOOO WHY U YELLLLLLLLLLL");

            }else if(response.endsWith("?")){
                System.out.println("ya i guess");

            }else if(response.equals("")){
                System.out.println("fine be that WAY");

            }else if(response.equals("bye")){
                System.out.println("cya chump");

            }else{
                System.out.println("whatEVER");
            }


    }
}
