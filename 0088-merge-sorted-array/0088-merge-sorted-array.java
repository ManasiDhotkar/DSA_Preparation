class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i =0;
       int j = nums1.length-1;

       while(i<n)
       {
           nums1[j] = nums2[i];
           i++;
           j--; 
       }

       Arrays.sort(nums1);
    }
}