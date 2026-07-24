import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        int[] rows = {
            2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 
            3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3
        };

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();
            int targetRow = rows[lower.charAt(0) - 'a'];
            boolean isValid = true;

            for (int i = 1; i < lower.length(); i++) {
                if (rows[lower.charAt(i) - 'a'] != targetRow) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
