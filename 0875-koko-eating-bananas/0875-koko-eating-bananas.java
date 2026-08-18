class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1;
        int r = 0;
        for(int i=0;i<n;i++){
            if(piles[i]>r){
                r = piles[i];
            }
        }
        while(l < r){
            int mid  = l + (r-l)/2;
        if(canEatAll(piles,h,mid)){
            r = mid;
        }
        else{
            l = mid + 1;
        }
        }
        return l;
    }
    private boolean canEatAll(int[]piles,int h,int speed){
        long hours = 0;
        for(int pile: piles){
            hours += pile/speed;
            if(pile % speed != 0){
                hours++;
            }
        }
        return hours <= h;
    }

}