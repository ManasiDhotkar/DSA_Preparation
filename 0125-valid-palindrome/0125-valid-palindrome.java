class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString()))
        {
            return true;
        }
        return false;  
        }
      
}