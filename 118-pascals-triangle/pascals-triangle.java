import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows <= 0) return triangle;

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); //edges are 1
                } else {
                    int aboveLeft  = triangle.get(i - 1).get(j - 1);
                    int aboveRight = triangle.get(i - 1).get(j);
                    row.add(aboveLeft + aboveRight);
                }
            }

            triangle.add(row);
        }
        return triangle;
    }
}
