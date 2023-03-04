import java.util.Comparator;
import java.util.Set;

public class StrongPw {
    /*
    A password is said to be strong if it satisfies all the following criteria:
        It has at least 8 characters. -D
        It contains at least one lowercase letter. -D
        It contains at least one uppercase letter. -D
        It contains at least one digit. -D
        It contains at least one special character. -D
            The special characters are the characters in the following string: "!@#$%^&*()-+".
        It does not contain 2 of the same character in adjacent positions -D
            (i.e., "aab" violates this condition, but "aba" does not).
    Given a string password, return true if it is a strong password. Otherwise, return false.
    Source: https://leetcode.com/problems/strong-password-checker-ii/
     */

    public boolean strongPasswordCheckerII(String password) {
        boolean lower = false, upper = false, digit = false, spec = false;
        if(password.length() >= 8) {
            char index = password.charAt(0);
            for (int i = 0; i < password.length(); i++) {
                if(i >= 1 && index == password.charAt(i) ) return false; else index = password.charAt(i);

                if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z') lower = true;
                if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') upper = true;
                if(password.charAt(i) >= '0' && password.charAt(i) <= '9') digit = true;

                Set<Character> special = Set.of('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+');
                if(special.contains(password.charAt(i))) spec = true;
            }
        }
        return lower && upper && digit && spec;
    }
}
