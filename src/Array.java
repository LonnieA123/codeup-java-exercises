public class Array {

    public static void main(String[] args) {

//        double[] nums = new double[4];
//        nums[0] = 3;
//        nums[1] = 4;
//        nums[2] = 8;
//        nums[3] = 1;

        double[] nums = {3,4,8,1};



        double sum = 0;
        for (double num : nums){
            sum += num;
        }

        System.out.println(sum);

    }

}
