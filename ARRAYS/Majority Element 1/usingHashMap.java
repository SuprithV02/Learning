import java.util.HashMap;

public class usingHashMap {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        int ans = 0;
        for (int key : m.keySet()) {
            if (index < m.get(key)) {
                index = m.get(key);
                ans = key;
            }
        }

        return ans;
    }

    public static void main(String args[]) {

        int nums[] = { 1 };

        int answer = majorityElement(nums);

        System.out.println(answer);
    }
}
