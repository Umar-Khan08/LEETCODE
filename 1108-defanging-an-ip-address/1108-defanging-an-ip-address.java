class Solution {
    public String defangIPaddr(String adr) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<adr.length();i++){
            if(adr.charAt(i)=='.') sb.append("[.]");
            else sb.append(adr.charAt(i));
        }
        return sb.toString();
    }
}