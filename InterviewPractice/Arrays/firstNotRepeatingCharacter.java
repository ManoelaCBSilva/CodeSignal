char firstNotRepeatingCharacter(String s) {
    
    final Integer ONE = 1;

    LinkedHashMap<Character, Integer> occurrences = new LinkedHashMap<>();
    
    for (int idx = 0; idx < s.length(); idx++) {
        if (occurrences.containsKey(s.charAt(idx))) {
            occurrences.put(s.charAt(idx), occurrences.get(s.charAt(idx)) + ONE);
            continue;
        }   
        occurrences.put(s.charAt(idx), ONE);
    }
    occurrences.put('_', ONE);

    return occurrences.entrySet().stream().filter(entry -> entry.getValue() == ONE).findFirst().get().getKey();
}