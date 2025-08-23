class Solution {
    public int maxRepeating(String sequence, String word) {
        int n = sequence.length();
        int m = word.length();
        int best = 0;

        for (int i = 0; i + m <= n; i++) {
            int count = 0;
            int pos = i;

            //keep matching word back to back
            while (pos + m <= n && sequence.regionMatches(pos, word, 0, m)) {
                count++;
                pos += m;
            }
            best = Math.max(best, count);
        }
        return best;
    }
}
