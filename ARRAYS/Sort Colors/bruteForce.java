import java.util.HashMap;

class bruteForce {

    public void bruteForceApproach(int[] nums) {

        HashMap<Integer, Integer> m = new HashMap<>();

        m.put(0, 0);
        m.put(1, 0);
        m.put(2, 0);

        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.get(nums[i]) + 1);
        }

        int index = 0;
        for (int colors = 0; colors < 3; colors++) {
            int feq = m.get(colors);
            for (int i = 0; i < feq; i++) {
                nums[index] = colors;
                index++;
            }
        }

        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] + " ");
        }
    }

    public static void main(String args[]) {
        bruteForce b = new bruteForce();

        int nums[] = { 2, 0, 2, 1, 1, 0 };

        b.bruteForceApproach(nums);
    }
}