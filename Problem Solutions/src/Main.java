public class Main {

    public static void main(String[] args) {

        /*
        // Roman Decimal Problem
        RomanToDecimal ob = new RomanToDecimal();

        // Considering inputs given are valid
        String str = "MCMIV";
        System.out.println("Integer form of Roman Numeral " + str +
                " is " + ob.romanToDecimal(str));
         */

        // Longest Common Prefix Problem
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] words = {"Adam", "Evan", "Envelope", "Donkey", "Adult","Adamantine"};
        String [] wordsWithout = {"games", "movies", "bingo", "school", "words", "affiliate"};
        System.out.println("The longest common prefix amongst the list of strings is: " + lcp.longestCommonPrefix(words));
        System.out.println("The longest common prefix amongst the list of strings is: " + lcp.longestCommonPrefix(wordsWithout));
    }
}
