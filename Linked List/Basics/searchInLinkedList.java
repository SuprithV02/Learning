
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class searchInLinkedList {

    public static boolean searchInLinkedList(Node head, int target) {

        while (head != null) {
            if (head.data == target) {
                return true;
            }
            head = head.next;
        }

        return false;
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        boolean answer = searchInLinkedList(head, 50);

        System.out.println(answer);
    }
}
