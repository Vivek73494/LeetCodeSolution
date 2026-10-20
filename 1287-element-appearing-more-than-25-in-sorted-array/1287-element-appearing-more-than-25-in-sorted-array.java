class Solution {
    public int findSpecialInteger(int[] arr) {
      HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
            map.put(arr[i],1);
        }
       }
       int max=0;
       int ans=arr[0];
       for(int key:map.keySet()){
        if(map.get(key)>max){
            max=map.get(key);
            ans=key;
        }
       }
       return ans;
    }
}