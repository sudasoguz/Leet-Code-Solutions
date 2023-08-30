package poweroffour;

class Solution {
    public static boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        if (n % 4 != 0 || n<= 0) return false;
        return isPowerOfFour(n/4);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}