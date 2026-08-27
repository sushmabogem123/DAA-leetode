class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(String sentence:sentences){
            int Words = 1;
             for(int i =0;i<sentence.length();i++){
                if(sentence.charAt(i) == ' '){
                    Words++;
                }

            }  
            maxWords = Math.max(maxWords,Words);  
        }
        return maxWords;
    }
}