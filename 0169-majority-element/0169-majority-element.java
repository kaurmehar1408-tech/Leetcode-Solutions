class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> count = new HashMap<>();
        int maxcount = -1;
        int res = -1;
        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for(int num:count.keySet()){
            if(count.get(num)>maxcount){
               maxcount = count.get(num);
               res = num;
            }
        }
        return res;
    }
}