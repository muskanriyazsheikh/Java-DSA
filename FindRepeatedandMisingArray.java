import java.util.Arrays;
public class FindRepeatedandMisingArray {
    public static void printReapeat(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i] + " "+"is Repeated");
                }
            }
        }
    }

    public static void printMissing(int[] arr){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
         int diff = arr[i+1] - arr[i];
         if(diff>=1){
            for(int j=1; j<diff; j++){
                System.out.println(arr[i]+j +" " + "is Missing");
            }
         }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,1};
       printReapeat(arr);
    printMissing(arr);
    }
}
