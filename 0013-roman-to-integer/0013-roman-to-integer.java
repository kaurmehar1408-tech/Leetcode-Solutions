class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> romanmap = new HashMap<>();
        romanmap.put('I',1);
        romanmap.put('V',5);
        romanmap.put('X',10);
        romanmap.put('L',50);
        romanmap.put('C',100);
        romanmap.put('D',500);
        romanmap.put('M',1000);

        int prev = 0;
        int total = 0;
        for(int i=s.length()-1;i>=0;i--){
            int current = romanmap.get(s.charAt(i));

            if(current < prev){
                total -= current;
            }
            else{
                total += current;
            }
            prev = current;
        }
        return total;
    }
}