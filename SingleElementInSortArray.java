public class SingleElementInSortArray {
    public static int printSingleElement(int arr[]){
     int st =0;  
     int end = arr.length-1;
     while(st<end) {
        int mid = st +(end-st)/2;
        if(mid%2 == 0) {
            if(arr[mid]== arr[mid+1]) {
                st = mid+2;
            }
            else{
                end = mid;
            }
        }
            else{
                if(arr[mid] == arr[mid-1]) {
                    st = mid+1;
                }else {
                end = mid;
                }
            }
        }
     
     return arr[st];
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4,8,8};
        System.out.println("the single element in the array is: " +printSingleElement(arr));
     
    }
}
