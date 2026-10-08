class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashSet<Integer> set = new HashSet<>();
        int a = -1;
        long asum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val = grid[i][j];
                asum += val;
                if(set.contains(val)){
                    a = val;
                }
                else{
                    set.add(val);
                }

            }
        }
        long N = n*n;
        long esum = N*(N+1)/2;
        int b = (int) (esum -(asum-a));
        return new int[]{a,b};
    }
}