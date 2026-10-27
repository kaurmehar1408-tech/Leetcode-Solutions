class Solution {
    public int thirdMax(int[] nums) {
        Long fmax = null;
        Long smax = null;
        Long tmax = null;
        for(int num : nums){
            if((fmax != null && fmax == num)||(smax != null && smax == num)|| (tmax != null && tmax == num)){
                continue;
            }
            if(fmax == null || num > fmax){
                tmax = smax;
                smax = fmax;
                fmax = (long)num;
            }
            else if(smax == null || num > smax){
                tmax = smax;
                smax = (long)num;
            }
            else if(tmax == null || num > tmax){
                tmax = (long)num;
            }
        }
        return tmax == null ?fmax.intValue():tmax.intValue();
    }
}