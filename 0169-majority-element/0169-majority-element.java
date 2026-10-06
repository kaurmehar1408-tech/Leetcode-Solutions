import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> counter = new HashMap<>();

        for(int num : nums){
            counter.put(num,counter.getOrDefault(num,0)+1);
        }
        int maxcount = -1;
        int res = -1;

        for(int num:counter.keySet()){
            if(counter.get(num)>maxcount){
                maxcount = counter.get(num);
                res = num;
            }
        }
        return res;
    }
}
