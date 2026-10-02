class Solution {
    public int findLucky(int[] arr) {
        int[] arr1=new int[arr.length];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
            int i=0;
        for(int key:map.keySet()){
        
            if(key==map.get(key)){
                arr1[i]=key;
                i++;
            }
        }
        int max=0;
        for(i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        if(max==0){
            return -1;
        }
        return max;

    }
}