package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);


    public String getString(){
        System.out.println("say somethin");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("yah or no");
        return this.scanner.nextLine().startsWith("y");
    }



    public boolean getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d: ",min, max);
        int num = this.scanner.nextInt();


        if (num > min && num < max){
            System.out.printf("your number is %d ",num);
        }else {
            System.out.printf("FALSE your number is not in range %n",num);
           getInt(min,max);
        }
        return true;
    };


    public int getInt(){
        System.out.println("give me an integer");
        return this.scanner.nextInt();
    }

    public boolean getDouble(double min, double max){
        System.out.printf("Enter a number between %.2f and %.2f: ",min, max);
        int num = this.scanner.nextInt();


        if (num > min && num < max){
            System.out.printf("your number is %d ",num);
        }else {
            System.out.printf("FALSE your number is not in range %n",num);
            getDouble(min,max);
        }
        return true;
    };


    public Double getDouble(){
        System.out.println("give me a double");
        return this.scanner.nextDouble();
    }


}
