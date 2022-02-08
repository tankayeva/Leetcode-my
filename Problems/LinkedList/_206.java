package LinkedList;

public class _206 {


     // Definition for singly-linked list.
      public class ListNode {
         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {

        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }
    }


    class Solution2 {

        public ListNode reverseList(ListNode head) {
            /* recursive solution */
            return reverseListInt(head, null);
        }

        private ListNode reverseListInt(ListNode head, ListNode newHead) {
            if (head == null)
                return newHead;
            ListNode next = head.next;
            head.next = newHead;
            return reverseListInt(next, head);
        }
    }
}
