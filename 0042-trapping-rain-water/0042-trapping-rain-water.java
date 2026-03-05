class Solution {
    public int trap(int[] height) {
        int c=0;
       int left=0;
       int n=height.length-1;
       int right=n;
       int leftmax=0;
       int rightmax=0; 
       while(left<right){
          if(height[left]<height[right]){
            if(height[left]>=leftmax){
                leftmax=height[left];
            }
            else{
                c+=leftmax-height[left];
            }
            left++;
          }
            else{
            if(height[right]>=rightmax){
                rightmax=height[right];
            }
            else{
                c+=rightmax-height[right];
            }
            right--;
            }
       }
       return c;
    }
}