class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int currSum = 0;
        int mx = 0;
        for(int i =0 ;i<k;i++){
            currSum += nums[i];

        }
        mx =currSum;
        for(int right = k;right<nums.length;right++){
            currSum -= nums[left];
            currSum += nums[right];
            mx = Math.max(mx,currSum);
            left++;
        }
        return (double) mx/k;


    }
}