class Solution {
    public int addDigits(int num) {
        int sum=0;
        int sum2=0;
        int sum3=0;
        while(num>0)
        {
         int digit=num%10;
          sum=sum+digit;
          num=num/10;
        }
        int original=sum;
        while(original>0){
            int dig=original%10;
            sum2=sum2+dig;
            original=original/10;
        }
        int original2=sum2;
        while(original2>0){
            int di=original2%10;
            sum3=sum3+di;
            original2=original2/10;
        }
        return sum3;
    }
}