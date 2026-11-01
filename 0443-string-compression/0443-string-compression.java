class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        while (read < chars.length) {
            char current = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == current) // Counting identical characters in this group 
            {
                count++;
                read++;
            }
            chars[write++] = current;
            // Add the count's digits only when the group repeats.
            if (count > 1) {
                String countText = String.valueOf(count);
                for (int i = 0; i < countText.length(); i++) {
                    chars[write++] = countText.charAt(i);
                }
            }
        }
        return write;
    }
}