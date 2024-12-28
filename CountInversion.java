import java.util.*;
public class CountInversion {
    public static int merge(int[] arr, int st, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = st, j = mid+1;
        int invCount = 0;
         
        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
                invCount += (mid -i + 1);
            }
        }
        while(i <= mid) {
            temp.add(arr[i]);
                i++;
        }
        while (j <= end) {
            temp.add(arr[j]);
            j++;
        }

        for(int idx = 0; idx < temp.size(); idx++) {
            arr[idx + st] = temp.get(idx);
        }

        return invCount;
      
    }
    public static int mergeSort(int[] arr, int st, int end) {
        if(st< end) {
            int mid = st +(end-st) /2;
            int leftInvCount = mergeSort(arr, st, mid);
            int rightInvcount = mergeSort(arr, mid+1, end);
            
            int Invcount = merge(arr, st,mid, end);
            
            return leftInvCount + rightInvcount + Invcount;
        }
       return 0;
    }
    public static void main(String[] args) {
        int[] arr = {6,3,5,2,7};

        int ans = mergeSort(arr, 0, arr.length - 1);
     System.out.println("inversion count is:" +ans);     
    }
}
