class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max=0;
        for(String sentence:sentences){
            int wordCount=1;
            for(int i=0;i<sentence.length();i++){
                if(sentence.charAt(i)==(' ')){
                    wordCount=wordCount+1;
                }
            }
         
            
            if(wordCount>max){
                max=wordCount;
            }
        }
        return max;
    }
}