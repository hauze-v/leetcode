/* Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".

        Example 1:

        Input: ["flower","flow","flight"]
        Output: "fl"

        Example 2:

        Input: ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.

        Note:

        All given inputs are in lowercase letters a-z
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        // Set first string to the prefix. We'll be checking this prefix against the other strings and shorting it when necessary
        String prefix = strs[0];

        // Loop from the second string onwards
        for (int i=1; i<strs.length; i++) {
            // While the prefix != 0, meaning while the prefix is NOT found in the string:
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() -1); // Shorten it
            }
        }
        return prefix;
    }
}

// prefix = "flower"
// ["flow", "flight"]