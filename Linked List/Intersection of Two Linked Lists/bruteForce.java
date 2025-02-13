
class ListNode {
    int data;
    ListNode next;

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
    static ListNode insertNode(ListNode head, int val) {
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

        while (headB != null) {
            ListNode temp = headA;
            while (temp != null) {
                if (temp == headB)
                    return headB;
                temp = temp.next;
            }
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
