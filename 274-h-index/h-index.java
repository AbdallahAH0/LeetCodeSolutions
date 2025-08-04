
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); //at first we sort the array

        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int AtLeastPaper = n - i;

            //check if this is a valid H-index
            if (citations[i] >= AtLeastPaper) {
                return AtLeastPaper;
            }
        }

        //if no valid h-index found
        return 0;
    }
}
