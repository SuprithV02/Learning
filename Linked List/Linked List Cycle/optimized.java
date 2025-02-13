
class ListNode {
    int data;
    ListNode next;

    ListNode() {
    }

    ListNode(int var1) {
        this.data = var1;
        this.next = null;
    }

    ListNode(int var1, ListNode var2) {
        this.data = var1;
        this.next = var2;
    }
}

public class optimized {

    public static ListNode insertNode(ListNode head, int val) {
        ListNode newHead = new ListNode(val);

        if (head == null) {
            head = newHead;
            return head;
        }

        ListNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newHead;
        return head;
    }

    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        // Check if there is a loop
        // in the linked list
        if (hasCycle(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

    }
}
