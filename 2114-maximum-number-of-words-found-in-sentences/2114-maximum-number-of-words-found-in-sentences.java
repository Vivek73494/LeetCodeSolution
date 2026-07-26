class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max=0;
        for(String sentence:sentences){
            int wordCount=0;
         
            wordCount=wordCount+sentence.split(" ").length;
            if(wordCount>max){
                max=wordCount;
            }
        }
        return max;
    }
}