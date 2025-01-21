
public class optimalApproach {

    public static int majorityElementByTwo(int[] nums) {

        int ele = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                ele = nums[i];
            } else if (ele == nums[i])
                count++;
            else
                count--;
        }

        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele)
                count1++;
        }

        if (count1 > (nums.length / 2))
            return ele;

        return -1;

    }

    public static void main(String args[]) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };

        int answer = majorityElementByTwo(nums);

        System.out.println(answer);

    }
}
