package romanToInteger;

import java.util.HashMap;

class Solution {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = (s.length() - 1); i >= 0; i--) {

            int currentValue = values.get(s.charAt(i));

            if (currentValue >= prevValue) {
                total += currentValue;
            } else {
                total -= currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }
}