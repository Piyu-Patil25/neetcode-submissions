class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String str : strs) {
            // Convert the string to a char array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            
            // Use the sorted string as the key
            String key = new String(charArray);
            
            // Add the string to the corresponding group in the map
            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(str);
        }
        
        // Return all the groups as a list of lists
        return new ArrayList<>(anagramMap.values());
    }
}
