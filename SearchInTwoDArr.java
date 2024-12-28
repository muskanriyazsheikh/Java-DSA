public class SearchInTwoDArr {
    public static boolean Searchtarget(int[][] arr,int target) {
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},
                   {10,11,16,20},
                   {23,30,34,60}};
                   System.out.println(Searchtarget(arr,5));
    }
}
