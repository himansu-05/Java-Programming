package p03_array;

public class SumOfOddNosInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int result = sumOfOdd(nums);
        System.out.println(result);
    }
    public static int sumOfOdd(int[] nums){
        int sum = 0;
        for (int num : nums) {
            if (num % 2 != 0)
                sum += num;
        }
        return sum;
    }
}
