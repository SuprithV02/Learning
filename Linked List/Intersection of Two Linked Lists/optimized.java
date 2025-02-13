
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

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode dummy1 = headA;
        ListNode dummy2 = headB;

        while (dummy1 != dummy2) {
            dummy1 = dummy1 == null ? headB : dummy1.next;
            dummy2 = dummy2 == null ? headA : dummy2.next;
        }

        return dummy1;
    }

    public static void main(String args[]) {

        ListNode head = null;
        head = insertNode(head, 1);
        head = insertNode(head, 3);
        head = insertNode(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 4);
        ListNode headA = head;
        head = head.next.next.next;
        ListNode headSec = null;
        headSec = insertNode(headSec, 3);
        ListNode headB = headSec;
        headSec.next = head;

        ListNode answerNode = getIntersectionNode(headA, headB);

        System.out.println(answerNode.data);
    }
}
