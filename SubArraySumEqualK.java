import java.util.HashMap;

public class SubArraySumEqualK {
    public static int SubarraySumk(int arr[], int k) {
        int count =0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
         map.put(0,1);
        for(int i=0; i<arr.length; i++) {
            sum +=arr[i];
            if(map.containsKey(sum - k)) {
                count  += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println("Number of subarray with sum " + k + ":" + SubarraySumk(arr,k));
    }
}
