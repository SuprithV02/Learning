import java.util.ArrayList;
import java.util.List;

class optimized {

    public List<Integer> optimizedApproach(int num) {
        int ans = 1;
        List<Integer> l = new ArrayList<>();

        l.addFirst(ans);
        for (int i = 1; i < num; i++) {
            ans = ans * (num - i);
            ans = ans / i;
            l.addLast(ans);
        }

        return l;
    }

    public List<List<Integer>> pascalsTriangle(int number) {

        List<List<Integer>> solution = new ArrayList<>();

        for (int i = 1; i <=number; i++) {
            solution.add(optimizedApproach(i));
        }

        return solution;
    }

    public static void main(String args[]) {
        optimized o = new optimized();

        List<List<Integer>> ans = o.pascalsTriangle(5);

        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele);
            }
            System.out.println();
        }

    }
}
