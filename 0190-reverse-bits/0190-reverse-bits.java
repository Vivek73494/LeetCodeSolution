class Solution {
    public int reverseBits(int n) {
     String s=Integer.toBinaryString(n);
     while(s.length()<32){
        s="0"+s;
     }
     String r="";
     for(int i=s.length()-1;i>=0;i--){
        r=r+s.charAt(i);
     }
     Integer answer=Integer.parseUnsignedInt(r,2);
     return answer;
    }
}
