class Solution {
    public int heightChecker(int[] heights) {
        int[] newH=new int[heights.length];
        int count=0;
        for(int i=0;i<heights.length;i++){
            newH[i]=heights[i];
        }
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
           if(heights[i]!=newH[i]){
            count++;
           }
        }
        
        return count;
    }
}