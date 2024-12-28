public class MaximumProductofSubarray {
    public static void printMaxProductSubArray(int[] nums){
        int minprod = nums[0];
        int maxprod = nums[0];
        int result = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] < 0) {
             int temp = maxprod;
             maxprod = minprod;
             minprod = temp;
            }
            maxprod = Math.max(nums[i], maxprod * nums[i]);
            minprod = Math.max(nums[i], minprod*nums[i]);
            result = Math.max(result, maxprod);
        }
        System.out.println("maximum product of subarray is: "+ result);
    }
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
      printMaxProductSubArray(nums);
    }
}
