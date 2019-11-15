/*
    Unit Tests for palindromes
*/

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {

    /*Test a one word Palindrome*/
    @Test
    public void testOneWordPalindrome() {
        Palindrome value = new Palindrome();

        Boolean result = value.isPalindrome("madam");

        assertTrue(result);

    }

    /*Test a one word that's not a Palindrome*/
    @Test
    public void testOneWordNonPalindrome() {
        Palindrome value = new Palindrome();

        Boolean result = value.isPalindrome("madam1");

        assertFalse(result);

    }

    /*Test a string of words that is a Palindrome*/
    @Test
    public void testLongStringPalindrome() {
        Palindrome value = new Palindrome();

        Boolean result = value.isPalindrome("Never odd or even");

        assertTrue(result);

    }

    /*Test a string of words that is not a Palindrome*/
    @Test
    public void testLongStringNonPalindrome() {
        Palindrome value = new Palindrome();

        Boolean result = value.isPalindrome("Life is good");

        assertFalse(result);

    }

    /*Test a numeric string that is a Palindrome*/
    @Test
    public void testNumericPalindrome() {
        Palindrome value = new Palindrome();

        Boolean result = value.isPalindrome("10501");

        assertTrue(result);

    }

    /*Test a numeric string that is not a Palindrome*/
    @Test
    public void testNumericNonPalindrome() {
        Palindrome value = new Palindrome();

        Boolean result = value.isPalindrome("10551");

        assertFalse(result);

    }

}
