public class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>(); //stores indices of increasing heights

        for (int i = 0; i <= n; i++) {
            int curHeight = (i == n) ? 0 : heights[i]; //0 at the end
            //while current bar is lower, resolve rectangles for taller bars
            while (!stack.isEmpty() && curHeight < heights[stack.peek()]) {
                int h = heights[stack.pop()];
                int leftIndex = stack.isEmpty() ? -1 : stack.peek();
                int width = i - leftIndex - 1; //span where h is the min height
                maxArea = Math.max(maxArea, h * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
