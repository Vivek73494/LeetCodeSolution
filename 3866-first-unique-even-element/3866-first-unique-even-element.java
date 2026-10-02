class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] even=new int[nums.length];
           int i=0;
           for(int num:nums){
            if(num%2==0){
                even[i]=num;
                 i++;
            }
           }
           HashMap<Integer,Integer>map=new LinkedHashMap<>();
           for(i=0;i<even.length;i++){
            if(map.containsKey(even[i])){
                map.put(even[i],map.get(even[i])+1);
            }
            else{
                map.put(even[i],1);
            }
           }
           for(int key:map.keySet()){
            if(key!=0 && map.get(key)==1){
                return key;
            }
           }
           return -1;
    }
}