class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int ans[] = new int[n];
        prefix[0] =1;
        suffix[n-1] = 1;
       
        for(int i=0;i<n-1;i++)
        {
           prefix[i+1] = prefix[i] * nums[i];
        }

        for(int j=n-1;j>0;j--)
        {
            suffix[j-1] = nums[j] * suffix[j];
        }
      
        for(int k=0;k<n;k++)
        {
            ans[k] = prefix[k] * suffix[k];
        }
        return ans;
    }
}