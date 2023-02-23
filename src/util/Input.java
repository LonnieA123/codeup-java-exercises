package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);
    private final Scanner scan= new Scanner(System.in);

    public String getString(){
        System.out.println("say somethin");
        return this.scanner.nextLine();
    }



    public boolean yesNo(){
        System.out.println("yah or no");
        return this.scanner.nextLine().startsWith("y");
    }

    public int getInt(){
        String userInput = getString();
        try{
            return Integer.parseInt(userInput);
        } catch (Exception e){
            System.out.println(e + "this is wrong ");
            return getInt();
        }
    }

    public void getInt(int min, int max) {
        try{
            System.out.printf("Enter a number between %d and %d: ", min, max);
            int num = this.scanner.nextInt();

            if (num > min && num < max){
                System.out.printf("your number is %d ",num);
            }else {
                System.out.printf("FALSE your number is not in range %n",num);
                getInt(min,max);
            }
        } catch (Exception e ){
            System.out.println("this is not it try again lol ");

        }


    };


    public Double getDouble(){
        String userInput = getString();
        try{
            return Double.parseDouble(userInput);
        } catch (Exception e){
            System.out.println(e + "this is wrong ");
            return getDouble();
        }
    }


    public void getDouble(double min, double max){
        try{
            System.out.printf("Enter a number between %.2f and %.2f: ",min, max);
            int num = this.scan.nextInt();


            if (num > min && num < max){
                System.out.printf("your number is %d ",num);
            }else {
                System.out.printf("FALSE your number is not in range %n",num);
                getDouble(min,max);
            }
        } catch (Exception e ){
            System.out.println("this is wrong " + e);
        }


    };





}
