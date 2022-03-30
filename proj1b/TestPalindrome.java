import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();
    static CharacterComparator cc1 = new OffByOne();
    static CharacterComparator cc2 = new OffByN(2);

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testisPalindrome() {
        assertTrue(palindrome.isPalindrome("ywxxwy"));
        assertFalse(palindrome.isPalindrome("wxy"));
    }

    @Test
    public void testisPalindrome2() {
        assertTrue(palindrome.isPalindrome("xacdby", cc1));
        assertFalse(palindrome.isPalindrome("wxy", cc1));
    }

    @Test
    public void testisPalindrome3() {
        palindrome.isPalindrome("xacecz", cc2);
        assertTrue(palindrome.isPalindrome("xacecz", cc2));
        assertFalse(palindrome.isPalindrome("qwe", cc2));
    }
}
