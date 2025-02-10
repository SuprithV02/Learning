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

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        int cnt = 0;
        ListNode temp = head;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        if (cnt == n) {
            ListNode newHead = head.next;
            head = null;
            return newHead;
        }

        int value = cnt - n;
        temp = head;

        while (temp != null) {
            value--;
            if (value == 0) {
                break;
            }
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        head = removeNthFromEnd(head, 5);

        System.out.print("Middle Linked List: ");
        printLinkedList(head);
    }
}
