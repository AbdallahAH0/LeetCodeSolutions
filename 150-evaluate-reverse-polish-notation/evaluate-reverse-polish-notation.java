public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String tok : tokens) {
            if (isOperator(tok)) {
                int b = stack.pop();   //second operand
                int a = stack.pop();   //first operand
                int res = 0;

                switch (tok) {
                    case "+": res = a + b; break;
                    case "-": res = a - b; break;
                    case "*": res = a * b; break;
                    case "/": res = a / b; break; //division 
                }

                stack.push(res);
            } else {
                stack.push(Integer.parseInt(tok)); //handle negative values also
            }
        }

        return stack.pop();
    }

    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}
