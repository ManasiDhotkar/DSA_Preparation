class Solution {
    public String oddString(String[] words) {
        char ch = 'a';
        Map <Character,Integer> mp= new HashMap<>();
        for(int i=0;i<26;i++)
        {
            mp.put((char)(ch++),i); // character and its corresponding index
        }

        String nonOdd = ""; // storing nonOdd value (such as "[0,1,1]")
        if(Arrays.toString(diffArray(words[0],mp)).equals(Arrays.toString(diffArray(words[1],mp))))
        {
            // Checking whether first two has same diff int array
            nonOdd = Arrays.toString(diffArray(words[0],mp)); // set nonOdd 
        }
        else{
             if(Arrays.toString(diffArray(words[0],mp)).equals(Arrays.toString(diffArray(words[2],mp))))
        {
            // Checking whether first and third has same diff int array because we cannt determine whether first or second is unique.
             return words[1]; // if above condition is true then return second index as its unique
        }
        else {
            return words[0]; // above condt. failed thats wht first is unique;
        }
        }

        for(int j=0;j<words.length;j++) // if Odd String is not determine in first 3 index then find nonOdd 
       // int array and traverse find nonOdd one by comparing each one ;
        {
            if(!nonOdd.equals(Arrays.toString(diffArray(words[j],mp)))){
                return words[j];
            }
        }
        return "";
    }

    public static int[] diffArray (String str,Map <Character,Integer> map)
    {
        int n = str.length();
        int arr[] = new int[n-1];
        for(int i=0;i<=n-2;i++)
        {
            arr[i] = map.get(str.charAt(i+1)) - map.get(str.charAt(i));
        }
        return arr;
    }
}