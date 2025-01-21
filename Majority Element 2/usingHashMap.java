import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class usingHashMap {

    public static List<Integer> majorityElementTwo(int[] nums) {

        int length = nums.length;

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int num : nums) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }

        List<Integer> l = new ArrayList<>();

        int value = Math.abs(length / 3);

        for (int key : h.keySet()) {
            if (h.get(key) > value) {
                l.add(key);
            }
        }

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
