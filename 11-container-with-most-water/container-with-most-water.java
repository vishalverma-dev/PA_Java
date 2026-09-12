class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;
        int a = 0;

        while(left<right){

            int l = Math.min(height[left], height[right]);
            int cal = l*(right-left);
            a = Math.max(a, cal);

            if(height[left]<height[right]) left++;
            else right--;

        }

        return a;
        
    }
}