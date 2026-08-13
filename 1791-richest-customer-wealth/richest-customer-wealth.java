class Solution {
    public int maximumWealth(int[][] accounts) {
       int maxwealth = 0 ;
       for(int[] customer:accounts){
        int currentwealth = 0;
        for(int money : customer){
            currentwealth += money;

        }
        if(currentwealth>maxwealth){
            maxwealth = currentwealth;
        }
       } 
    return maxwealth;
    }



}