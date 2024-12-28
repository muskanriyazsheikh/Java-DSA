import java.util.*;

public class FourSum {
    public static List<List<Integer>> printFourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n;) {
                int k = j + 1, l = n - 1;
                while (k < l) {
                    long sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }
                    }
                }
                j++;
                while (j < n && nums[j] == nums[j - 1]) {
                    j++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        System.out.println(printFourSum(nums, 8));
    }
}