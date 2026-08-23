class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            String bin = Integer.toBinaryString(c);
            sb.append("00000000", 0, 8 - bin.length());
            sb.append(bin);
        }
        int l=0,r=sb.length()-1;
        while(l<r){
            if(sb.charAt(l)!=sb.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}