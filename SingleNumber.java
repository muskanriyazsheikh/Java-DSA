public class SingleNumber {
  public static void printSingleNumber(int arr[]) {
    int singleNumber =0; 
    for(int i=0; i<arr.length; i++) {
      singleNumber^= arr[i];
    }
    System.out.println(singleNumber + " is the single number");
  }  
  public static void main(String args[]) {
    int[] arr = {4,1,2,1,2};
    printSingleNumber(arr);
  }
}
