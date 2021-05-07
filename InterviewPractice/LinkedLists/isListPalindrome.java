boolean isListPalindrome(ListNode<Integer> l) {
    
    if (l == null || l.next == null) {
        return true;
    }
    
    ListNode<Integer> slowIterator = l;
    ListNode<Integer> fastIterator = l;
    
    while (fastIterator != null && fastIterator.next != null) {
        slowIterator = slowIterator.next;
        fastIterator = fastIterator.next.next;
    }    
    
    if (fastIterator != null) {
        slowIterator = slowIterator.next;
    }
    
    ListNode<Integer> invertedList = reverseList(slowIterator);
        
    while (l != slowIterator && invertedList != null) {
        if (!l.value.equals(invertedList.value)) {
            return false; 
        }
        l = l.next;
        invertedList = invertedList.next;
    }
    
    return true;
}

ListNode<Integer> reverseList(ListNode<Integer> init) {
    
    ListNode<Integer> next = null;
    ListNode<Integer> previous = null;
    
    while (init != null) {
        
        next = init.next;
        init.next = previous;
        
        previous = init;
        init = next;   
    }
       
    return previous;
}