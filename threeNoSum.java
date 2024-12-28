import java.lang.reflect.Array;
import java.util.*;
public class threeNoSum {
    ///this is brute force approach which is time complexity is O(n^3)
   // public static List<List<Integer>> print3Sum(int[] nums) {
       // List<List<Integer>> ans = new ArrayList<>();
        //Set<List<Integer>> set = new HashSet<>();
        // for(int i=0; i<nums.length-1; i++) {
          //  for(int j=i+1; j<nums.length-1; j++) {
            //    for(int k=j+1; k<nums.length-1; k++) {
              //      if(nums[i] +nums[j] + nums[k] == 0) {
                //        int trip[] = {nums[i], nums[j] , nums[k]};
                  //      Arrays.sort(trip);
                    //     List<Integer> tripList = Arrays.asList(trip[i], trip[j], trip[k]);
                      //  if(!set.contains(tripList)) {
                        //    set.add(tripList);
                     //     //  ans.add(tripList);
                  //     // }
               //     }
               // }
           // }
         //}
        // return ans;
    // }
    //
    public static List<List<Integer>> print3Sum(int[] nums) {
      int n =nums.length;
      List<List<Integer>> ans = new ArrayList<>();
      Arrays.sort(nums);
      for(int i=0; i<n; i++) {
        if(i>0 && nums[i] == nums[i-1]) {
          continue;
        }
        int j = i+1, k=n-1;
        while(j<k) {
          int sum = nums[i] +nums[j] +nums[k];
          if(sum > 0) {
            k--;
          }
          else if(sum < 0) {
            j++;
          }else {
              ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
              j++; k--;
              while(j<k && nums[j] == nums[j-1]) {
                j++; 
              }
          }
        }
      }
      return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(print3Sum(nums));
    }
}
