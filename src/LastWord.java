public class LastWord {
    /*
    Given a string s consisting of words and spaces,
    return the length of the last word in the string.
    A word is a maximal substring consisting of non-space characters only.
    Source: https://leetcode.com/problems/length-of-last-word/
     */

    public int lengthOfLastWord(String s) {
        int counter = 0;
        String t = s.trim();
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == ' ') counter = 0;
            else counter++;
        }
        return counter;
    }
}
