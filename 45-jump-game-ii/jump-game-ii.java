class Solution {
    public int jump(int[] nums) {
        int jumps = 0;        // total jumps we do
        int currentEnd = 0;   //farthest we can go with current number of jumps
        int farthest = 0;     //farthest we can reach while iterating 

        for (int i = 0; i < nums.length - 1; i++) { //update farthest
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;                
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}
