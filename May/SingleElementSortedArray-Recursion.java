class Solution {
    public int singleNonDuplicate(int[] nums) {
        return nums[singleelement(0, nums)];
    }
    
    public int singleelement(int i,int[] nums){
        if (i == nums.length -1 || nums[i] != nums[i+1]){
            return i;
        }
        return singleelement(i+2, nums);
    }
}



Example 1:

Input: [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: [3,3,7,7,10,11,11]
Output: 10