class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int currentmax = nums[0];
        for(int i =1;i<n;i++){
            currentmax = Math.max(nums[i],currentmax + nums[i]);
            max = Math.max(max,currentmax); 

        }
        return max;
    }
}