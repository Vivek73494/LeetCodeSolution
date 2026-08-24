class Solution {
    public int pivotIndex(int[] nums) {
       int n=nums.length;
       int leftsum=0;
       int totalsum=0;
       for(int i:nums){
           totalsum=totalsum+i;
       }
       for(int i=0;i<n;i++){
        int rightsum=totalsum-nums[i]-leftsum;
        if(leftsum==rightsum){
            return i;
        }
        leftsum=leftsum+nums[i];
       }
       return -1;
    }
}