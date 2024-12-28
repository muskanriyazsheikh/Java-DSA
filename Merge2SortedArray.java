import java.util.Arrays;
public class Merge2SortedArray {
    public static void mergeArray(int[] A, int[] B, int n, int m){
        int idx = n+m -1;
        int i = n-1;
        int j = m-1;
        while(i>=0 && j>=0) {
            if(A[i] > B[j]) {
                A[idx] = A[i];
                i--;
                idx--;
            }else {
                A[idx] = B[j];
                j--;
                idx--;
            }
        }
        while(j >= 0) {
            A[idx] = B[j];
            j--;
            idx--;
        }
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,0,0,0};
        int[] B = {4,5,6};
        mergeArray(A, B, 3, 3);
        System.out.println(Arrays.toString(A));
    }
}
