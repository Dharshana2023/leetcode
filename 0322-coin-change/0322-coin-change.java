class Solution {
    public int coinChange(int[] coins, int amount) {
      int []dp=new int[amount+1];
      dp[0]=0;
      for(int i=1;i<=amount;i++){
        dp[i]=amount+1;
      }  
      for(int i=0;i<coins.length;i++){
        for(int j=coins[i];j<=amount;j++){
            int bal=j-coins[i];
            if(dp[bal]+1<dp[j]){
                dp[j]=dp[bal]+1;
            }
        }
      }
      if(dp[amount]==amount+1) return -1;
      return dp[amount];
    }
}