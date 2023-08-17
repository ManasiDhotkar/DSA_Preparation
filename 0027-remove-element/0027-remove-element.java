class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length-1;
        int temp=0;
        while(start <= end)
        {
            if(nums[start] != val){
                start ++;
            }
            else if(nums[end] == val)
            {
                end --;
            }
            else if((nums[start]==val)&&(nums[end]!=val))
            {
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        return (start);
    }
}