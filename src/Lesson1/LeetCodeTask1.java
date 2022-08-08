package Lesson1;

public class LeetCodeTask1 {
    public static void main(String[] args) {
        /*
        Given an integer number n, return the difference between the product of its digits and the sum of its digits.
         */
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        int digit = 0;

        while (n > 0) {
            digit = n % 10;
            sum += digit;
            prod *= digit;
            n /= 10;
        }
        return prod - sum;
    }
}
