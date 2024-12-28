
import java.util.Arrays;
public class FindPairwithSum {
    public static void main(String[] args) {
        int[] arr = {4,5,6,0,1,2,3};
        Arrays.sort(arr);
        int x= 6;
        int left =0, right = arr.length-1;
        boolean found = false;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == x){
                found = true;
                break;
            }
            else if( sum < x){
                left++;
            }else{
                right--;
            }
        }
        System.out.print(found);
    }
}
