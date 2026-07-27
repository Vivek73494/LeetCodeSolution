class Solution {
    public boolean isAcronym(List<String> words, String s) {
            ArrayList<String>list=new ArrayList<>();
            for(int i=0;i<words.size();i++){
                String word=words.get(i);
                for(int j=0;j<word.length();j++){
                    list.add(String.valueOf(word.charAt(j)));
                    break;
                }
            }
            String ans="";

            for(String str:list){
                ans=ans+str;
            }


            if(s.equals(ans)){
                return true;
            }
            else{
                return false;
            }
    }
}