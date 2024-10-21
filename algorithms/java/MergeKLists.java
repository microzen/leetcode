public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = mergeSort(lists, 0, lists.length - 1);
        return dummyHead;
    }
    ListNode mergeSort(ListNode[] lists, int start, int end) {
        ListNode dummyHead = new ListNode(0);
        if (start < end) {
            int mid = (start + end) / 2;
            ListNode l = mergeSort(lists, start, mid);
            ListNode r = mergeSort(lists, mid + 1, end);
            dummyHead.next = merge(l,r);
        }else if(start == end){
            return lists[start];
        }
        return dummyHead.next;
    }
    ListNode merge(ListNode l, ListNode r) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        while (l != null && r != null) {
            if(l.val < r.val) {
                curr.next = new ListNode(l.val);
                l = l.next;
            }else{
                curr.next = new ListNode(r.val);
                r = r.next;
            }
            curr = curr.next;
        }
        while (l != null) {
            curr.next = new ListNode(l.val);
            curr = curr.next;
            l = l.next;
        }
        while (r != null) {
            curr.next = new ListNode(r.val);
            curr = curr.next;
            r = r.next;
        }

        return dummyHead.next;
    }
}
