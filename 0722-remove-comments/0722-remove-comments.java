class Solution {
    public List<String> removeComments(String[] source) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean block = false;
        for (String line : source) {
            int i = 0;
            while (i < line.length()) {
                if (!block && i + 1 < line.length() && line.charAt(i) == '/' && line.charAt(i + 1) == '*') {
                    block = true;
                    i += 2;
                }
                else if (block && i + 1 < line.length() && line.charAt(i) == '*' && line.charAt(i + 1) == '/') {
                    block = false;
                    i += 2;
                }
                else if (!block && i + 1 < line.length() && line.charAt(i) == '/' && line.charAt(i + 1) == '/') {
                    break;
                }
                else if (!block) {
                    sb.append(line.charAt(i));
                    i++;
                }
                else {
                    i++;
                }
            }
            if (!block && sb.length() > 0) {
                ans.add(sb.toString());
                sb.setLength(0);
            }
        }
        return ans;
    }
}