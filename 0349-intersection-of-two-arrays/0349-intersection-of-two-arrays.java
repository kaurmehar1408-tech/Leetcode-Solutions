class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }

        HashSet<Integer> iset = new HashSet<>();
        for(int num : nums2){
            if(set1.contains(num)){
                iset.add(num);
            }
        }
        int[] result = new int[iset.size()];
        int index = 0;
        for(int num : iset){
            result[index++] = num;
        }
        return result;
    }
}