import java.util.*;
public class FindMininRotatedArray {
    public static void minArray(int[] nums){
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
           if(nums[i]<min){
           min = nums[i];
           }
        }
        System.out.println("minimum element is :"+ min);
    }
    public static void main(String[] args) {
        int[] nums = {5,1,2,0,3};
        minArray(nums);
    }
}
