import java.util.HashMap;

public class optimized {

    public static int[] optimizedApproach(int[] nums, int target) {

        int[] answer = new int[2];
        answer[0] = answer[1] = -1;
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int remainingNumber = target - num;
            if (m.containsKey(remainingNumber)) {
                answer[0] = m.get(remainingNumber);
                answer[1] = i;
                break;
            }

            m.put(nums[i], i);
        }

        return answer;
    }

    public static void main(String args[]) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] answer = optimizedApproach(nums, target);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }

    }
}
