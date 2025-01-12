import java.util.HashMap;

class usingHashMap {

    public static int usingHashMapApproach(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Populate the HashMap with counts
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the number with count greater than 1
        for (int key : countMap.keySet()) {
            if (countMap.get(key) > 1) {
                return key;
            }
        }

        // If no duplicate is found (edge case)
        return -1;
    }

    public static void main(String args[]) {

        int nums[] = { 3, 3, 3, 3, 3 };

        int number = usingHashMapApproach(nums);

        System.out.println(number);
    }
}