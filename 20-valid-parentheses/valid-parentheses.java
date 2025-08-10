public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            //here if it's a opening bracket we push into the stack.
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            //if a closing bracket came, we check the stack
            else {
                if (stack.isEmpty()) {
                    return false; //no opening bracket was found in the stack, return false
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; //wrong match
                }
            }
        }

        //true if stack is empty
        return stack.isEmpty();
    }
}
