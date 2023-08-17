class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];
        int answer[] = new int[nums.length];
        prefix[0] = 1;
        suffix[nums.length-1] = 1;

        for(int i=0;i<nums.length-1;i++)
        {
            prefix[i+1] = prefix[i] * nums[i];
        }

        for(int i=nums.length-1;i>0;i--)
        {
            suffix[i-1] = suffix[i] * nums[i];
        }

        for(int i=0;i<nums.length;i++)
        {
            answer[i] = prefix[i] * suffix[i];
        }

        return answer;
    }
}