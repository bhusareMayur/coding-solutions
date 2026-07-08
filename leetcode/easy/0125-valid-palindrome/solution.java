class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            char c = s.charAt(i);
            char c2 = s.charAt(j);
            while ((c < 'a' && c > 'z') || (c < 'A' && c > 'Z')) i++;
            while((c2 < 'a' && c2 > 'z') || (c2 < 'A' && c2 > 'Z')) j--;
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}