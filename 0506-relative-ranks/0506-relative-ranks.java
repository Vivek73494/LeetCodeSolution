class Solution {
    public String[] findRelativeRanks(int[] score) {

      int n=score.length;
      String answer[]=new String[n];
      int sorted[]=score.clone();
      Arrays.sort(sorted);

      for(int i=0;i<n;i++){
        int rank=0;
        for(int j=n-1;j>=0;j--){
            if(score[i]==sorted[j]){
                rank=n-j;
                break;
            }
        }
        if(rank==1){
            answer[i]="Gold Medal";
        }
        else if(rank==2){
            answer[i]="Silver Medal";
        }
        else if(rank==3){
            answer[i]="Bronze Medal";
        }
        else{
            answer[i]=String.valueOf(rank);
        }
      } 
      return answer;
        
    }
}