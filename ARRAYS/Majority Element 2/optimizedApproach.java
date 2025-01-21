import java.util.ArrayList;
import java.util.List;

public class optimizedApproach {

    public static List<Integer> majorityElementTwo(int[] nums) {

        int length = nums.length;
        int count1 = 0, count2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;

        for (int i = 0; i < length; i++) {
            if (count1 == 0 && ele2 != nums[i]) {
                count1 = 1;
                ele1 = nums[i];
            } else if (count2 == 0 && ele1 != nums[i]) {
                count2 = 1;
                ele2 = nums[i];
            } else if (ele1 == nums[i]) {
                count1++;
            } else if (ele2 == nums[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < length; i++) {
            if (ele1 == nums[i])
                cnt1++;
            if (ele2 == nums[i])
                cnt2++;
        }

        List<Integer> l = new ArrayList<>();
        int value = (int) (length / 3) + 1;

        if (cnt1 >= value)
            l.add(ele1);
        if (cnt2 >= value)
            l.add(ele2);

        return l;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2 };

        List<Integer> ans = majorityElementTwo(nums);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
