public class optimizedWithoutList {

    public void reverse(int[] nums, int first, int second) {
        while (first <= second) {
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;

            first++;
            second--;
        }
    }

    public void optimizedWithoutListApproach(int[] nums) {
        int len = nums.length;

        int index = -1;

        for (int i = len - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                index = i - 1;
                break;
            }
        }

        if (index == -1) {
            reverse(nums, 0, len - 1);
            return;
        }

        for (int i = len - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        reverse(nums, index + 1, len - 1);

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + "");
        }
    }

    public static void main(String args[]) {
        optimizedWithoutList op = new optimizedWithoutList();

        int nums[] = { 1, 2, 3 };

        op.optimizedWithoutListApproach(nums);
    }
}
