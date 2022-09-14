package Replit_Tasks;

public class MaxNumber {
    public static void main(String[] args) {
        int[] nums={1,4,2,5,3,3432432,2};
        int max=nums[0];


        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                max=nums[i];
            }
        }

        System.out.println(max);

    }

}
