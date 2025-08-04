class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(); //mapping each char with it's valiue
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total = 0; //place-holder for the total

        for(int i=0; i< s.length(); i++){ 
        int current = map.get(s.charAt(i)); //loop through each char
        if(i+1 < s.length() && current < map.get(s.charAt(i+1))) //checking to substact or add 
        {
            total = total - current;

        } else {
            total = total + current;
        }

    }
    return total;
}
}