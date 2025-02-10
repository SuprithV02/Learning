
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

public class optimized {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode newNode = new ListNode(-1);
        ListNode temp = newNode;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return newNode.next;
    }

    static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            // Print the data of the current ListNode
            System.out.print(temp.data + " ");
            // Move to the next ListNode
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        System.out.print("First sorted linked list: ");
        printLinkedList(list1);

        System.out.print("Second sorted linked list: ");
        printLinkedList(list2);

        ListNode mergedList = mergeTwoLists(list1, list2);

        System.out.print("Merged sorted linked list: ");
        printLinkedList(mergedList);
    }
}
