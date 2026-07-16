class Reverse {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int pop = x % 10;   // Get last digit
            x = x / 10;         // Remove last digit

            // Check for positive overflow
            if (result > Integer.MAX_VALUE / 10 ||
               (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // 2147483647
            }

            // Check for negative overflow
            if (result < Integer.MIN_VALUE / 10 ||
               (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // -2147483648
            }

            result = result * 10 + pop;
        }

        return result;
    }
}