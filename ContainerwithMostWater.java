public class ContainerwithMostWater {
    public static int maxArea(int[] height){
        int left =0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right) {
            int left_h = height[left];
            int right_h = height[right];
            int min_h = Math.min(left_h, right_h);
            int lenght = right - left;
            int currArea = min_h * lenght;
            maxArea = Math.max(maxArea, currArea);
            if(left_h < right_h) {
            left++;
            }else {
            right--;
            }
        }
        return maxArea;

    }
    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("the Max area is: " +maxArea(height));
    }
}

