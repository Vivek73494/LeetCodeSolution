class Solution {
    public int gcdOfOddEvenSums(int n) {
     int m=n+n;
     int oddSum=0;
     int evenSum=0;
      for(int i=0;i<m;i++){
        if(i%2==0){
            evenSum=evenSum+i;
        }
        else{
            oddSum=oddSum+i;
        }
     }
      int max=Math.max(oddSum,evenSum);
      int min=Math.min(oddSum,evenSum);

      while(min!=0){
        int temp=min;
        min=max%min;
        max=temp;
      }
      return max;
    }
}