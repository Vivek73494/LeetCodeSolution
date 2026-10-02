class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        int max=0;
        for(int count:map.values()){
           if(count>max){
            max=count;
           }
        }
        int ans=0;
        for(int count:map.values()){
            if(count==max){
                ans=ans+count;
        }
        }
        return ans;
    }
}