class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] newnum=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            newnum[i]=nums[i];
        }
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
           newnum[nums.length+j]=nums[i];
           j++;
        }
        return newnum;
}    
}