public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode current = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 == null) {
            while (list2 != null) {
                current.next = new ListNode(list2.val);
                current = current.next;
                list2 = list2.next;
            }
        } else {
            while (list1 != null) {
                current.next = new ListNode(list1.val);
                current = current.next;
                list1 = list1.next;
            }
        }
        return head.next;
    }
}
