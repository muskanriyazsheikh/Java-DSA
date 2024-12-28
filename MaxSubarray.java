import java.util.*;

public class MaxSubarray {
    public static void main(String[] args) {
      int array[] = {5,4,-1,7,8};
      int maxSum = Integer.MIN_VALUE;
      int curSum =0;
      int start = 0, end =0 , tempStart =0;

      for(int i =0; i<array.length; i++) {
        curSum +=array[i];
        if(curSum> maxSum) {
          maxSum = curSum;
          start = tempStart;
          end = i;
        }
        if(curSum <0) {
          curSum =0; 
          tempStart = i+1;
        }
      }
      System.out.println("Max sum of array is: " + maxSum); 
      System.out.println("array Subarray with largest sum is:");
      for(int i= start; i<= end; i++) {
        System.out.print(array[i] + " ");
      }
      
     
    }
}
