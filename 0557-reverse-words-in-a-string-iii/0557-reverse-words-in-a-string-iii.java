class Solution {
    public String reverseWords(String s) {
        
        String[] words=s.split(" ");
        String rev="";
        for(String word:words){
          for(int i=word.length()-1;i>=0;i--){
            rev=rev+word.charAt(i);

          }
          rev=rev+" ";
        }

        return rev.trim();
    }
}