
import java.util.*;
public class mergeSameNumbers {
    public static int[] mergeArray(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                arr[i] = arr[i+1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0,4,5,4};
        int[] result = mergeArray(arr);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
