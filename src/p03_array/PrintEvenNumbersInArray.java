package p03_array;

public class PrintEvenNumbersInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < nums.length; i++) {
            if(isEven(nums[i])){
                System.out.println(nums[i]);
            }
        }
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }
}
