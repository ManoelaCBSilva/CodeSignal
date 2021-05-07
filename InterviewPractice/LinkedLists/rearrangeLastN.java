ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
    
    if (l == null || l.next == null || n == 0) {
        return l;
    }
    
    ListNode<Integer> previous = new ListNode(null);
    previous.next = l;
    ListNode<Integer> lastToBeRearranged = l;
    
    int count = 1;
    while (count < n) {
        lastToBeRearranged = lastToBeRearranged.next;
        count++;
    }
    
    // List size is equal to n. No rearrangement is needed
    if (lastToBeRearranged.next == null) {
        return l;
    }
    
    while (lastToBeRearranged.next != null) {
        previous = previous.next;
        lastToBeRearranged = lastToBeRearranged.next;
    }
    
    lastToBeRearranged.next = l;
    l = previous.next;
    previous.next = null;
    
    return l;
}