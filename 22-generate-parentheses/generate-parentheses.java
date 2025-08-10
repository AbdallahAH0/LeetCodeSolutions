public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(List<String> res, StringBuilder cur, int open, int close, int n) {
        //if the string is complete, add it
        if (cur.length() == 2 * n) {
            res.add(cur.toString());
            return;
        }

        //trying to add '(' if i still can
        if (open < n) {
            cur.append('(');
            backtrack(res, cur, open + 1, close, n);
            cur.deleteCharAt(cur.length() - 1); //backtracking
        }

        // Try to add ')' if it remains valid
        if (close < open) {
            cur.append(')');
            backtrack(res, cur, open, close + 1, n);
            cur.deleteCharAt(cur.length() - 1); // backtrack
        }
    }
}
