class Solution {
    public boolean checkIfPangram(String sentence) {
        // If length is less than 26, it cannot contain all 26 letters
        if (sentence.length() < 26) {
            return false;
        }

        // Keep track of visited letters
        boolean[] seen = new boolean[26];
        int uniqueCount = 0;

        for (char c : sentence.toCharArray()) {
            int index = c - 'a';
            if (!seen[index]) {
                seen[index] = true;
                uniqueCount++;
                // Early exit if all 26 letters have been found
                if (uniqueCount == 26) {
                    return true;
                }
            }
        }

        return uniqueCount == 26;
    }
}
