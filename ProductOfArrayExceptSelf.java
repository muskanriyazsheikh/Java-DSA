public class ProductOfArrayExceptSelf {
    public static void printProduct(int[] nums){
       int n = nums.length;
       for(int i=0; i<n ;i++) {
        int prod = 1;
        for(int j=0; j<n; j++) {
            if(i!=j) {
                prod = prod*nums[j];
            }
           
        }
        System.out.print(prod+" ");
       }

    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
         printProduct(nums);
         System.out.println();
    }
}
