class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1;   //the result of dp[1]
        int second = 2;  //the result of dp[2]

        for (int i = 3; i <= n; i++) {
            int current = first + second; 
            first = second;   //update first with the second value 
            second = current; // update the second with the value of curr.
        }

        return second;
    }
}
