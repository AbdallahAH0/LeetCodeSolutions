class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        //now the first step is finding the max among all before anything
        int max = candies[0];
        
        for(int i= 0; i< candies.length; i++)
            if (candies[i]> max){
                max = candies[i];
            }

        //now after finding the max, we compare each new value (after adding the extra candies) with the max and return a result array.

        for(int i = 0; i< candies.length; i++){
           int total = candies[i] + extraCandies;
             if(total>=max){   
             result.add(true);
             } else {
             result.add(false); 
             }
        }
             return result;
            }
}
