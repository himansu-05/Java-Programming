package p01_maths;

public class NeonNumber {
    public static void main(String[] args) {
        int  n = 1;
        if(isNeon(n)){
            System.out.println("Neon Number");
        }else {
            System.out.println("Not a Neon Number");
        }
    }

    private static boolean isNeon(int n) {
        int sqr = n * n;
        int sum = 0;
        while (sqr > 0){
            int temp = sqr % 10;
            sum += temp;
            sqr /= 10;
        }
        return sum == n;
    }
}
