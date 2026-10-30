class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for(int i=1;i<=n;i++){
            boolean div3 = (i%3==0);
            boolean div5 = (i%5==0);

            if(div3 && div5){
                answer.add("FizzBuzz");
            }
            else if(div3){
                answer.add("Fizz");
            }
            else if(div5){
                answer.add("Buzz");
            }
            else{
                answer.add(Integer.toString(i));
            }
        }
        return answer;
    }
}