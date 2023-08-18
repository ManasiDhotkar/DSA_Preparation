class Solution {
    public boolean isAnagram(String s, String t) {
       int arr[] = new int[26]; //26 alphabets
       if(s.length() != t.length())
       {
           return false;
       }
       for(int i=0;i<s.length();i++)
       {
           arr[s.charAt(i) - 'a'] ++; // adding
           arr[t.charAt(i) - 'a']--; // subtracting 
       }
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i] != 0) // if non zero occur in array
          {
              return false;
          }
      }
       return true;
    }
}