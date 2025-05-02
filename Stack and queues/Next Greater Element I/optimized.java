import java.util.HashMap;

public class optimized {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int res[] = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        int ans = -1;
        for (int i = 0; i < nums1.length; i++) {
            int index = map.get(nums1[i]);
            for (int j = index; j < nums2.length; j++) {
                ans = -1;
                if (nums2[j] > nums1[i]) {
                    ans = nums2[j];
                    break;
                }
            }
            res[i] = ans;
        }

        return res;
    }

    public static void main(String args[]) {

        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };

        int answer[] = new int[3];

        answer = nextGreaterElement(nums1, nums2);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }
}
