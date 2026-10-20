class Solution {
    public boolean isSameAfterReversals(int num) {
        int original=num;
        int reverse=0;
        int rev=0;
       if(num==0){
        return true;
       } 
       while(num>0){
        int digit=num%10;
        reverse=reverse*10+digit;
        num=num/10;
       }
       
       while(reverse>0){
        int digit=reverse%10;
        rev=rev*10+digit;
        reverse=reverse/10;
       }
       if(original==rev){
        return true;
       }
       else{
        return false;
       }

    }
}