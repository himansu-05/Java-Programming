package p01_maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12521;
        if (isPalindrome(n)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

    private static boolean isPalindrome(int n) {
        int rev = 0;
        int num = n;
        while (n > 0){
            int temp = n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }
        return rev == num;
    }
}
