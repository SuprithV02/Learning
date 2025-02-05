
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insertionInBegginingLinkedList {

    public static Node insertionInBegginingLinkedList(Node head, int value) {

        Node newValue = new Node(value);

        newValue.next = head;

        head = newValue;

        return head;
    }

    public static void traversalLinkedList(Node head) {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();

    }

    public static void main(String args[]) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node headValue = insertionInBegginingLinkedList(head, 200);

        traversalLinkedList(headValue);
    }
}
