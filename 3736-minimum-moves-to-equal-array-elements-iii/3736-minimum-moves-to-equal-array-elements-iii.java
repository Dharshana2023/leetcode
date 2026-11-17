class Solution {
    public int minMoves(int[] nums) {
        int min=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            min=Math.max(min,nums[i]);
            s+=nums[i];
        }
        return (nums.length*min)-s;
    }
}