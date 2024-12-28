import java.util.Arrays;
public class NextPermutation {
    public static void permutation(int[] A){// tc: O(n) & Sc : O(1)
        //find the pivot
        int pivot = -1; int n = A.length;
        for(int i=n-2; i>=0; i--) {
            if(A[i] < A[i+1]) {
               pivot = i;
               break;
            }
        }
        if(pivot ==-1) {
         Arrays.sort(A);
         return;
        }
        //to find rightmost element 
        for(int i=n-1; i>pivot; i--) {
         if(A[i] > A[pivot]) {
             int temp = A[i];
             A[i] = A[pivot];
             A[pivot] = temp;
             break;
         }
        }
        //3. reverse the element
         int i = pivot+1;
         int j = n-1;
        while(i<=j) {
           int temp  = A[i];
           A[i] = A[j];
           A[j] = temp;
           i++;
           j--;
        }

      }
    public static void main(String[] args) {
        int[] A= {1,1,5};
        permutation(A);
        System.out.println(Arrays.toString(A));
       
    }
}
