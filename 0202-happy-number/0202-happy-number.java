class Solution {
    public boolean isHappy(int n) {

        while (n != 1) {

            int result = 0;

            while (n > 0) {
                int rem = n % 10;
                int rem2 = rem * rem;
                result = result + rem2;
                n = n / 10;
            }

            n = result;

            if (n == 4)
                return false;
        }

        return true;
    }
}