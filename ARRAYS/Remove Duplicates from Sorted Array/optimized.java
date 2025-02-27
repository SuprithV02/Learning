
public class optimized {

    public static int removeDuplicates(int[] nums) {

        int j = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        return j;

    }

    public static void main(String args[]) {

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int answer = removeDuplicates(nums);

        System.out.println(answer);
    }
}
