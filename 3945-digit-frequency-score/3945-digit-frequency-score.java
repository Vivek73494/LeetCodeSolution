class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        while(n>0){
            int digit=n%10;
            if(map.containsKey(digit)){
                map.put(digit,map.get(digit)+1);
            }else{
                map.put(digit,1);
            }
            n=n/10;
        }
        int sum=0;
        for(int key:map.keySet()){
           sum=sum+(map.get(key)*key);
        }
        return sum;
    }
}