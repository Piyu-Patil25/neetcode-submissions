class Solution {
    public boolean isAnagram(String s, String t) {
        // check if length of 2 strings re equal or not
        if(s.length() != t.length()){
            return false;
        }
        
        // convert strings to charArray
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        // sort the array in order
        Arrays.sort(sSort);
        Arrays.sort(tSort);

        // check if both are equal 
        return Arrays.equals(sSort, tSort);
    }
}
