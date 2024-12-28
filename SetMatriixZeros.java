import java.util.Arrays;

public class SetMatriixZeros {
    public static int[][] setMatrixZeros(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Determine if the first row or first column needs to be zero
       for(int i=0; i<rows; i++) {
        if(matrix[i][0] == 0) {
           firstRowZero = true;
           break;
        }
       }
        for(int j=0; j<cols; j++) {
            if(matrix[0][j] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Step 2: Use the first row and first column to mark zeros
        for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++){
               if(matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
               }
           }
        }

        // Step 3: Set the marked rows and columns to zero
         for(int i=0; i<rows; i++) {
            if(matrix[i][0] == 0) {
               for(int j=0; j<cols; j++) {
                matrix[i][j] = 0;
               }
            }
         }
         for(int j=0; j<cols; j++) {
            if(matrix[0][j] == 0) {
              for(int i=0; i<rows; i++) {
                matrix[i][j] =0;
              }
            }
         }

        // Step 4: Set the first row and first column to zero if needed
        if(firstRowZero) {
            for(int j=0; j<cols; j++) {
                matrix[0][j] = 0;
            }
        }
        if(firstColZero) {
            for(int i=0; i<rows; i++) {
              matrix[i][0] = 0;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        int[][] result = setMatrixZeros(matrix);

        // Print the modified matrix
        for (int[] row : result) {
            System.out.print(Arrays.toString(row) + " ");
        }
    }
}