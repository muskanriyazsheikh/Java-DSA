public class MejorityElement {
    public static int majorityNumber(int arr[], int n) {
        int count = 0;
       int candidate =-1;
       for(int i=0; i<n; i++) {
        if(count == 0) {
            candidate = arr[i];
            count  =1;
        }else if (candidate == arr[i]) {
            count++;
        }else {
            count--;
        }
       }
       //verify the candidate
       count =0;
       for(int i=0; i<n ;i++) {
        if(arr[i] == candidate) {
            count++;
        }
       } 
       if(count > n/2) {
        return candidate;
       }
       return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        int n = arr.length;
        System.out.println("Majority element is: " +majorityNumber(arr, n));
    }
}
