package people;
import java.util.Scanner;
public class People {

    //Instance variables
        private String firstName;
        private String lastName;
        private int age;
        private float bankBalance;
        private boolean single;

    //Instance setters
      public void setFirstName(String first){
          this.firstName = first;
      }

      public void setLastName(String last){
          this. lastName = last;
      }

      public void setAge(int age){
          this.age = age;
      }

      public void setBalance(float balance){
          this.bankBalance = balance;
      }

      public void setSingle(boolean status){
          this.single = status;
      }

    //Instance getters
        public String getFirstName(){
          return this.firstName;
        }

        public String getLastName(){
          return this.lastName;
        }

        public int getAge(){
          return this.age;
        }

        public float getBankBalance(){
          return this.bankBalance;
        }

        public boolean isSingle(){
          return this.single;
        }

      //Instance methods
        public String lifeSummary(){
            return String.format("Ok so your name is %s %s " +
                            "you are %d years old you have %.2f in the bank",
                    getFirstName(),getLastName(),getAge(),getBankBalance());
        }

      //constructor
        public People(String firstName,String lastName, int age, float bankBalance, boolean single ){
            System.out.printf("creating u %s %n",firstName);
          this.firstName = firstName;
          this.lastName = lastName;
          this.age = age;
          this.bankBalance = bankBalance;
          this.single = single;
    }

        Scanner scan = new Scanner(System.in);
        public People(){
            System.out.println("enter your first name");
            this.firstName = scan.nextLine();

            System.out.println("enter your last name");
            this.lastName = scan.nextLine();

            System.out.println("enter your age");
            this.age = scan.nextInt();

            System.out.println("enter your bank balance");
            this.bankBalance = scan.nextFloat();


        }





}
