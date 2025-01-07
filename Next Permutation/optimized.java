import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class optimized {

    public void optimizedApproach(int[] nums) {
        int n = nums.length;

        int index = -1;

        List<Integer> l = Arrays.stream(nums).boxed().collect(Collectors.toList()); // This is one way of converting the
                                                                                    // array to a Array list

        // This is the second method, where we can create an extra List and loop through
        // the array and add each element to a list
        // List<Integer> l = new ArrayList<Integer>();
        // for(int num : nums){
        // l.add(num);
        // }
        for (int i = n - 1; i > 0; i--) {
            if (l.get(i - 1) < l.get(i)) {
                index = i - 1;
                break;
            }
        }

        if (index == -1) {
            Collections.reverse(l);
            System.out.print(l);
            return;
        }

        for (int i = n - 1; i > index; i--) {
            if (l.get(i) > l.get(index)) {
                int temp = l.get(i);
                l.set(i, l.get(index));
                l.set(index, temp);
            }
        }

        Collections.reverse(l.subList(index + 1, n));

        System.out.print(l);
    }

    public static void main(String args[]) {
        optimized o = new optimized();

        int[] nums = { 1, 1, 5 };

        o.optimizedApproach(nums);
    }
}