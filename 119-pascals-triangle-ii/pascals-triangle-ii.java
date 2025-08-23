class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(Collections.nCopies(rowIndex + 1, 0));
        row.set(0, 1); //first element always 1

        for (int i = 1; i <= rowIndex; i++) {
            //update backwards to avoid overwriting
            for (int j = i; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }
}
