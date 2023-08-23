class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int temp = nums[0];
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(temp == nums[i])
            {
                count++;
            }
            else if (temp != nums[i]){
                temp = nums[i];
                count = 1;
            }

            if(count > (nums.length/2)){
                return nums[i];
            }
        }
        return 0;
    }
}