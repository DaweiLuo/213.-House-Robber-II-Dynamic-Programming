class Solution {
    public int rob(int[] nums) {
        return(Math.max(robCircle(nums, 1,nums.length-1),robCircle(nums,2,nums.length)));

    }
    public int robCircle(int[] nums, int low, int high){

        if(nums.length==0)return 0;
        else if(nums.length==1)return nums[0];
        int [][]dp = new int[nums.length+1][2];
        for(int i =low;i<=high;i++){
           dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]);
           dp[i][1]=nums[i-1]+dp[i-1][0];
        }

        return(Math.max(dp[high][0],dp[high][1]));

    }
}
