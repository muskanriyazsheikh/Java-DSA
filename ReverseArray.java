import java.util.Scanner;

public class ReverseArray {
    public static void main(String args[]) {
        int size = 4;

        int array[] =  { 2 , 3, 4,5};
       
       

        for(int i=0; i<size; i++){
            System.out.println(array[i]);
        }
          System.out.println("Array after Reverse:");
        for(int j=array.length-1; j>=0; j--){
            System.out.println(array[j]);
        }
    }
}
