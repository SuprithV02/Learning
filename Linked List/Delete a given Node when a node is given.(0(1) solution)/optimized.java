
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

class optimized {

    public static ListNode insertNode(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return head;
        }
        ListNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        return head;
    }

    static ListNode getNode(ListNode head, int val) {
        if (head == null)
            return null;
        while (head.data != val)
            head = head.next;

        return head;
    }

    static void deleteNode(ListNode t) {
        if (t == null)
            return;
        t.data = t.next.data;
        t.next = t.next.next;
        return;
    }

    static void printList(ListNode head) {
        if (head == null)
            return;
        while (head.next != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String args[]) {

        ListNode head = null;

        // inserting node
        head = insertNode(head, 1);

        head = insertNode(head, 4);

        head = insertNode(head, 2);
        head = insertNode(head, 3);

        System.out.println("Given Linked List: ");
        printList(head);

        ListNode t = getNode(head, 2);

        deleteNode(t);

        System.out.println("Linked List after deletion: ");
        printList(head);
    }
}