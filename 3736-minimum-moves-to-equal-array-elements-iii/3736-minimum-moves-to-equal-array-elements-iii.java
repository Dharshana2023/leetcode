class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        int s=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            s+=nums[i];
        }
        return (nums.length*max)-s;
    }
}