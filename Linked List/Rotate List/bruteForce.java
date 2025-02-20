
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

    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null)
            return head;

        int length = 0;

        ListNode tt = head;
        while (tt != null) {
            length++;
            tt = tt.next;
        }

        int rotation = k % length;

        for (int i = 0; i < rotation; i++) {
            ListNode temp = head;
            while (temp != null) {
                if (temp.next.next == null) {
                    ListNode newNode = temp.next;
                    temp.next = null;
                    newNode.next = head;
                    head = newNode;
                }
                temp = temp.next;
            }
        }

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

        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        head = rotateRight(head, 4);

        printLinkedList(head);

    }
}
