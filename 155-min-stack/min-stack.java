public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>(); //for the whole values
        minStack = new Stack<>(); // to track the min
    }

    //push value onto the stack
    public void push(int val) {
        mainStack.push(val);

        //push onto minStack if it's empty or val <= current min
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    //remove the top value
    public void pop() {
        if (mainStack.isEmpty()) return;

        int removed = mainStack.pop();

        //if removed value is the current min, pop from minStack too
        if (!minStack.isEmpty() && removed == minStack.peek()) {
            minStack.pop();
        }
    }

    //gets the top value
    public int top() {
        return mainStack.peek();
    }

    //gets the minimum value.
    public int getMin() {
        return minStack.peek();
    }
}
