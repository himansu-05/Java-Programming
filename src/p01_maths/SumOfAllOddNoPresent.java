package p01_maths;

public class SumOfAllOddNoPresent {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=50; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
