package twoPointer;

public class Day_13_Container_With_Most_Water_17_06_26 {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxArea = Integer.MIN_VALUE;
        while(left<=right){
            maxArea = Math.max(maxArea, Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right]){
                
            left++;
            }
            else
                right--;
            
        }
        return maxArea;
    }

     public static int maxAreaBruteForce(int[] height) {
        
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < height.length; i++){
            for(int j = i+1; j< height.length;j++){
                if(height[i]<height[j]){
                    maxArea = Math.max(maxArea,height[i]*(j-i));
                }
                else{
                    maxArea = Math.max(maxArea,height[j]*(j-i));
                }
            }
                
        }
        return maxArea;
    }

    
}
