import java.util.*;

public class MinMaxNumber {
    public static void main(String args[]) {
       
        Scanner sc = new Scanner(System.in);
        int size = 5;

        int number[] = {5,6,9,2,1};
         

        int min = number[0];
        int max = number[0];

        for(int i=0; i<size; i++){
            if(number[i]<min) {
                min = number[i];
            }
            if(number[i]>max){
                max = number[i];
            }
        }
        System.out.println("Maximum no is:" +max );
        System.out.println("Minimum no is:" +min);
    }
}