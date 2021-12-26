package LinkedList;

// EXplanation https://www.youtube.com/watch?v=Kka8VgyFZfc
public class _19 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode slow = dummy;
            ListNode fast = dummy;

            while (fast.next != null) {
                fast = fast.next;
                if (n-- <= 0) {
                    slow = slow.next;
                }
            }
            slow.next = slow.next.next;
            return dummy.next;

        }
    }
}
