class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int end = start +1;
        int temp = 0; // temporary storing value 
        while(end < nums.length)
        {
            if((nums[start] != nums[end]))
            {
                temp = nums[start+1];
                nums[start+1] = nums[end];
                nums[end] = temp;
                start ++;
                end ++;
            }
            else if(nums[start] == nums[end])
            {
                end ++;
            }
        }
        return (start + 1);
    }
}