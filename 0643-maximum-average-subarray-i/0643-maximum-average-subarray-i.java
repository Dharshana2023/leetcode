class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int max=nums[0];
     int currentavg=0;
     int s=0;
     for(int i=0;i<k;i++){
        s+=nums[i];
     }
        max=s;
     for(int i=k;i<nums.length;i++){
       s+=nums[i]-nums[i-k];
        currentavg = s;
        max=Math.max(max,currentavg);
     }
     return (double)max/k;
    }
}