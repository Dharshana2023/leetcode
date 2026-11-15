class Solution {
    public int maxSubarraySumCircular(int[] num) {
        int t=0;
        int currentmax=0;
        int max=num[0];
        int min=num[0];
        int currentmin=0;
        for(int i=0;i<num.length;i++){
            t+=num[i];
            currentmax= Math.max(num[i],currentmax + num[i]);
            max=Math.max(max,currentmax);
            currentmin= Math.min(num[i],currentmin+num[i]);
            min=Math.min(min,currentmin);
        }
        if(max<0){
            return max;
        }
        return Math.max(max,t-min);
    }
}