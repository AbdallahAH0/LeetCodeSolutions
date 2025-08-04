class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;  //a place-holder for the farthest we can reach

        for (int i = 0; i < nums.length; i++) { //if we are standing in somewhere i can't reach from return false.
            if (i > farthest) {
                return false;
            }

            farthest = Math.max(farthest, i + nums[i]); //update the farthest 
        }

        //If loop completes we are able to reach the end
        return true;
    }
}
