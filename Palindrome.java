class Palindrome {
    public boolean isPalindrome(int x) {
        // Special cases:
        // 1. Negative numbers are not palindromes (e.g., -121 because of the '-')
        // 2. Numbers ending in 0 are not palindromes, unless the number itself is 0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        // Reverse the second half of the digits
        while (x > reversedHalf) {
            reversedHalf = (reversedHalf * 10) + (x % 10);
            x /= 10;
        }

        // For an even number of digits, x should equal reversedHalf (e.g., 1221 -> x = 12, reversedHalf = 12)
        // For an odd number of digits, we can get rid of the middle digit by doing reversedHalf / 10
        // (e.g., 12321 -> x = 12, reversedHalf = 123 -> 123/10 = 12)
        return x == reversedHalf || x == reversedHalf / 10;
    }
}