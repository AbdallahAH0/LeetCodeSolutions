public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) { //these are edge cases.
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>(); //creating the rows.
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(currentRow).append(c);

            if (currentRow == 0 || currentRow == numRows - 1) { //change direction.
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1; //move to next row. up or now
        }

        StringBuilder result = new StringBuilder();//combine all rows into one string

        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}