ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
    
    if (l1 == null) {
        return l2;
    }
    
    if (l2 == null) {
        return l1;
    }
    
    ListNode<Integer> mergedHead = new ListNode(null);    
    ListNode<Integer> last = mergedHead;
    
    while (l1 != null && l2 != null) {
        if (l1.value > l2.value) {
            last.next = l2;
            l2 = l2.next;
        } else {
            last.next = l1;
            l1 = l1.next;
        }
        last = last.next;
    }
    
    last.next = l1 == null ? l2 : l1;
    
    return mergedHead.next;
}