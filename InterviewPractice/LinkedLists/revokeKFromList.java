ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    
    // Remove the elements == k that are at the beginning of the list
    while (l != null && l.value.equals(k)) {
        l = l.next;
    }
    
    ListNode<Integer> head = l;
    if (l != null) {
        ListNode<Integer> previous = l;
        l = l.next;
        while (l != null) {
            if (l.value.equals(k)) {
                previous.next = l.next;
            } else {
                previous = l;
            }
            l = l.next;
        }
    }
    
    return head;
}