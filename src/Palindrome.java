public class Palindrome {
    /*
    Given an integer x, return true if x is palindrome integer.
    An integer is a palindrome when it reads the same backward as forward.
    For example, 121 is a palindrome while 123 is not.
     */
    public boolean isPalindrome(int x) {
        boolean val = false;
        String hole = Integer.toString(x);
            int i = 0;
            int l = hole.length()-1;
            while(i < hole.length()) {
                if(hole.charAt(i) == hole.charAt(l)) {
                    val = true;
                } else {
                    val = false;
                    break;
                }
                i++;
                l--;
            }
        return val;
    }

}
