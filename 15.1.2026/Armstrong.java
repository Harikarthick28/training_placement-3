class Solution {
    public boolean isArmstrong(int num) {
        int temp = num, sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int d = num % 10;
            sum += Math.pow(d, digits);
            num /= 10;
        }
        return sum == temp;
    }
}
