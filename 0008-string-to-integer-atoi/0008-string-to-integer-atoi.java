class Solution {
    public int myAtoi(String s) {
   	int sign = 1;
		int i = 0;
		long result = 0; //long datatype due to if result exceed its limit (out of int)
		while (i < s.length() && s.charAt(i) == ' ') // discard whitespaces
		{
			i++;
		}
	  if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i++) == '-' ? -1 : 1;
        }

		while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') 
		// '0' - 48 and '9' - 57
		{
		   // gives int value;
			result = result * 10 + (sign*(s.charAt(i) - '0'));
			i++;
				if(result > Integer.MAX_VALUE) 
				{// integers greater than 231 - 1 should be clamped to 231 - 1.
					return Integer.MAX_VALUE;
				}
				else if(result < Integer.MIN_VALUE)
				//integers less than -231 should be clamped to -231
				{
					return Integer.MIN_VALUE;
				}
		}
		// Typecasting from Long into int
		return (int)result;
    }
}