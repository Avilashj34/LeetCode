//Runtime :- 0ms
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length -1){
            if(nums[i]!=nums[i+1]){
                break;
            }
            i += 2;
        }
        //System.out.println(nums[i]);
        return nums[i];
    }
    
}


Example 1:
Input: [1,1,2,3,3,4,4,8,8]
Output: 2


Example 2:

Input: [3,3,7,7,10,11,11]
Output: 10