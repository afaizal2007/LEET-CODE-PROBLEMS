class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            // Check if the number of digits is 2, 4, or 6 based on constraints
            if ((num >= 10 && num <= 99) || 
                (num >= 1000 && num <= 9999) || 
                (num == 100000)) {
                count++;
            }
        }
        return count;
    }
}
