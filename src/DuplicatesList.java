public class DuplicatesList {
/*
Given the head of a sorted linked list,
delete all duplicates such that each element appears only once.
Return the linked list sorted as well.
 */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode  removed = head;
        while (removed != null && removed.next != null) {
            try {
                if(removed.val == removed.next.val) {
                    removed.next = removed.next.next;
                } else
                removed = removed.next;
            }
            catch (NullPointerException e) {
                System.out.println("NullPointerException");
                return null;
            }
        }
        return  head;
    }
}
