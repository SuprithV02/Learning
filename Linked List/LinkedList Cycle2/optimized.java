
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

public class optimized {

    public static ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;

            fast = fast.next.next;

            if (slow == fast) {

                slow = head;

                while (slow != fast) {

                    slow = slow.next;
                    fast = fast.next;

                }

                return slow;
            }
        }
        return null;
    }

    public static void main(String args[]) {

        ListNode head = new ListNode(3);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(0);
        ListNode third = new ListNode(-4);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = first;

        ListNode answer = detectCycle(head);

        System.out.println(answer.data);
    }
}
