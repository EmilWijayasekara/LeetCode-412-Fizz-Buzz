/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            String num = Integer.toString(i);
            if(i%3==0 && i%5==0) {
                list.add("FizzBuzz");
            }
            else {
                if(i%3==0){
                    list.add("Fizz");
                }
                else {
                    if(i%5==0){
                        list.add("Buzz");
                    }
                    else {
                        list.add(num);
                    }
                }
            }
        }
        return list;
    }
}
// @lc code=end

