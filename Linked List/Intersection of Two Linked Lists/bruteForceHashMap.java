import java.util.HashSet;

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

public class bruteForceHashMap {

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

        HashSet<ListNode> st = new HashSet<>();

        while (headA != null) {
            st.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (st.contains(headB))
                return headB;
            headB = headB.next;
        }

        return null;
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
