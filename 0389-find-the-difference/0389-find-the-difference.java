class Solution {
    public char findTheDifference(String s, String t) {
     HashMap<Character,Integer>map=new HashMap<>();
     char a=' ';
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
     }
     for(int j=0;j<t.length();j++){
        char c=t.charAt(j);
        if(map.containsKey(c)){
            map.put(c,map.get(c)-1);
            if(map.get(c)==0){
                map.remove(c);
            }
        }
        else{
            a=c;
            break;
        }
     }
     return a;
    }
}