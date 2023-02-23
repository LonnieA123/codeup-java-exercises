public class ErrorPractice {

    public static void main(String[] args) {


        try{
            String me = "yoooooo";
            me.substring(0,me.length() + 1);

        } catch (IndexOutOfBoundsException nfx){
            System.out.println(nfx);
        }

    }
}



