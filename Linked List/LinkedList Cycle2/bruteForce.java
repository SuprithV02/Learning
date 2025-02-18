import java.util.HashMap;

class ListNode {
    int data;
    ListNode next;

    ListNode() {
    }

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class bruteForce {

    public static int detectCycle(ListNode head) {

        HashMap<Integer, Integer> h = new HashMap<>();

        ListNode temp = head;
        int pos = 0;

        while (temp != null) {
            if (h.containsKey(temp.data)) {
                return h.get(temp.data);
            } else {
                h.put(temp.data, pos);
                pos++;
                temp = temp.next;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        ListNode head = new ListNode(1);

        int answer = detectCycle(head);

        System.out.println(answer);
    }
}
