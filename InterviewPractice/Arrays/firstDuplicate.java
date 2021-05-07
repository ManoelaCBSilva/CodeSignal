int firstDuplicate(int[] a) {
    HashSet<Integer> seen = new HashSet<>();

    for (int idx = 0; idx < a.length; idx++) {
        if (seen.contains(a[idx])) {
            return a[idx];
        }
        seen.add(a[idx]);
    }
    return -1;
}