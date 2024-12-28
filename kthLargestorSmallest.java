import java.util.Arrays;
public class kthLargestorSmallest {
   public static int findKthSmallest(int[] nums, int k) {
    if(k < 1 || k > nums.length){
        return -1;
    }
    Arrays.sort(nums);
    return nums[k+1];
   }
     public static void main(String[] args) {
        int[] nums ={1,2,3,7,5,6};
        int k =3;
        int result = findKthSmallest(nums, k);
        System.out.println("Kth largest element is:" +result);
     }
}
