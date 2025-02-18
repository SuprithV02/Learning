
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

public class bruteForce {

    public static ListNode reversedHead(ListNode head) {

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {

            ListNode front = temp.next;
            temp.next = prev;

            prev = temp;

            temp = front;
        }

        return prev;
    }

    public static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reversedHead(slow);

        ListNode firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            secondHalf = secondHalf.next;
            firstHalf = firstHalf.next;
        }

        return true;
    }

    public static void main(String args[]) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        // Reverse the linked list
        boolean answer = isPalindrome(head);

        System.out.print(answer);
    }
}
