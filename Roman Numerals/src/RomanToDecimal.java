/* Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000

        For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

        Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.

        Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

        Example 1:

        Input: "III"
        Output: 3

        Example 2:

        Input: "IV"
        Output: 4

        Example 3:

        Input: "IX"
        Output: 9

        Example 4:

        Input: "LVIII"
        Output: 58
        Explanation: L = 50, V= 5, III = 3.

        Example 5:

        Input: "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

    1. Split the Roman Numeral string into Roman Symbols (character).

    2. Convert each symbol of Roman Numerals into the value it represents.

    3. Take symbol one by one from starting from index 0:
        If current value of symbol is greater than or equal to the value of next symbol, then add this value to the running total.
        else subtract this value by adding the value of next symbol to the running total.

 */


import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RomanToDecimal {

    // Function for converting roman symbol into value
    public int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    // Find decimal value of a given roman numeral
    public int romanToDecimal(String str) {

        // Initialize result
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            // Get value of first symbol
            int s1 = value(str.charAt(i));

            // Make sure you're not out of bounds before proceeding
            if (i+1 < str.length()) {
                // Get value of the next symbol
                int s2 = value(str.charAt(i+1));

                // Compare values
                if (s1 >= s2) {
                    // Value of current symbol is greater than or equal to next symbol
                    res = res + s1;
                } else {
                    // Value of current symbol is less than next symbol
                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
                i++;
            }
        }
        return res;
    }
}
