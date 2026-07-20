class Solution {
    public boolean isAnagram(String s, String t) {
        // Anagrams must have the exact same length
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];

        // Increment for characters in 's' and decrement for characters in 't'
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        // If any count is not zero, they are not anagrams
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
