public class ReverseLS {
    /*
    Given the head of a singly linked list,
    reverse the list, and return the reversed list.
    Source: https://leetcode.com/problems/reverse-linked-list/
     */

    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
