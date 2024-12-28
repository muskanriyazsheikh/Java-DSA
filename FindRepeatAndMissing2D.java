public class FindRepeatAndMissing2D {
    public static void printRepeat(int arr[][]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                for(int k =i; k<arr.length; k++) {
                    for(int l= (k == i ? j+1 : 0); l<arr[k].length; l++) {
                        if(arr[i][j] == arr[k][l]) {
                            System.out.println( arr[i][j]  + " " + "is Repeated");
                        }
                    }
                 }
            }
        }
    }
    public static void printMissing(int arr[][]) {
        boolean[] found = new boolean[arr.length * arr[0].length +1];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                found[arr[i][j]] = true;
            }
        }
        for(int i=1; i<found.length; i++) {
            if(!found[i]) {
                System.out.println(i  + " " + "is missing");
            }
        }
     }
     public static void main(String args[]) {
        int[][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,1}};
        printRepeat(arr);
        printMissing(arr);
     }
}
