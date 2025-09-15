class Solution {
    public boolean isHappy(int n) {
        int slow = square_digits(n);
        int fast = square_digits(square_digits(n));
        while (slow != fast) {
            slow = square_digits(slow);
            fast = square_digits(square_digits(fast));
            if (slow == 1 || fast == 1) {
                return true;
            }
        }
        return slow == 1; // ou fast == 1
    }

    public int square_digits(int n) {
        int square = 0;
        while (n > 0) {
            int digit = n % 10;
            square += digit * digit;  // ✅ on additionne
            n = n / 10;
        }
        return square;
    }
}
