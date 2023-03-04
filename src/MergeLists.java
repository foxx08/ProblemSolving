public class MergeLists {
      /*
      You are given the heads of two sorted linked lists list1 and list2.
      Merge the two lists in a one sorted list.
      The list should be made by splicing together the nodes of the first two lists.
      Return the head of the merged linked list.
      Source: https://leetcode.com/problems/merge-two-sorted-lists/
       */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode(), current = merge; // current is needed to save the head of the list and return it later
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                merge.next = list1;
                list1 = list1.next;
            } else {
                merge.next = list2;
                list2 = list2.next;
            }
            merge = merge.next;
        }
        if(list1 != null) merge.next = list1; else merge.next = list2;
        System.out.println(current.next.val);
        return current.next;
    }
}
