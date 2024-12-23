public class peakIndexOfMountain {
    public static int peakIndex(int arr[]){
    int st = 0;
    int end = arr.length-1;
    while(st<end){
        int mid = st + (end-st)/2;
        if(arr[mid] < arr[mid+1]){
            st = mid+1;
        }
        else{
            end = mid;
        }
    }
    return st;
}
    public static void main(String[] args) {
        int arr[] = {0,6,7,8,1,0};
        System.out.println(peakIndex(arr));
    }
}
