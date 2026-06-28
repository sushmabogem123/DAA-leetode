class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int n = nums.length;
        for(int i = 0;i<n;i++){
            count[nums[i]] += 1;
        }
        for(int i = 1;i<count.length;i++){
            count[i] = count[i]+count[i-1];
        }
        int[] res =new int[n];
        for(int i = 0;i<n;i++){
            if(nums[i]==0){
                res[i] = 0;
            }else{
                res[i] = count[nums[i]-1];
            }
            

        }
        return res;

       
    
    }
}