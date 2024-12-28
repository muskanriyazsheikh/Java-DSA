public class TrapRainWater {
    public static int  trap(int[] height){
        int left = 0;
        int right = height.length-1;
        int water = 0; int maxleft = 0, maxright = 0;
        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left]>=maxleft){
                    maxleft = height[left]; 
                }
                else{
                    water = water + maxleft - height[left];
                }
                left++;
            }
            else{ 
                if(height[right]>= maxright){
                maxright = height[right];
            }
            else{
                water = water + maxright - height[right];
            }
            right--;
           } 
        }
        return water;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println("Trapped water: "+ trap(height));
    }

}
