import java.util.ArrayList;


public class Kadai2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums =
                new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(2);

        System.out.println(countOccurrences(nums,3));
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int countOccurrences(ArrayList<Integer> nums, int target) {
        int count = 0;
        for (Integer num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;

    }

    public static int filterPositive(ArrayList<Integer> nums) {
        ArrayList<Integer> positiveNumbers =
                new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
        }
    }
}