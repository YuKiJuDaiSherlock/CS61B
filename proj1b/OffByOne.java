import org.junit.Test;

public class OffByOne implements CharacterComparator{

    @Override
    public boolean equalChars(char x, char y) {
        if (x - y == 1 || x - y == -1) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String word) {
        char[] s=word.toCharArray();
        for (int i = 0; i < s.length / 2; i++) {
            if (s[i] != s[s.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
