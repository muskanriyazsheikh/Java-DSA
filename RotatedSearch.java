import java.util.*;

public class RotatedSearch {
    public static int  search(int[] nums, int tar){
        int st =0;
        int end = nums.length-1;
           while(st <= end) {
            int mid = st +(end-st)/2;
                  if(nums[mid] == tar) {
                    return mid;
                  }
                  else if(nums[st] <= nums[mid]){ //left sorted
                    if(tar <= nums[mid] && tar>= nums[st]) {
                        end = mid-1;
                    }
                    else {
                        st = mid+1;
                    }
                  }
                  else {
                    if(tar >=nums[mid] && nums[end] >= tar) {
                        st = mid+1;
                    }else {
                        end = mid-1;
                    }
                  }
                 
         } return -1;

        }
        public static void main(String[] args) {
            int nums[] = {4,5,6,7,0,1,2};
           System.out.println(search(nums, 0)); 
        }
}   
