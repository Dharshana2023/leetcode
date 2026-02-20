class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int sum) {

        int[] dp = new int[sum + 1];

        for (int i = 0; i <= sum; i++)
            dp[i] = -1;

        dp[0] = 0;

        for (int num : nums) {
            for (int j = sum; j >= num; j--) {
                if (dp[j - num] != -1) {
                    dp[j] = Math.max(dp[j], dp[j - num] + 1);
                }
            }
        }

        return dp[sum];
    }
}