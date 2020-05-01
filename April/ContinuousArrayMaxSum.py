#Max Continuous subArray

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        max_far=0
        mar = -9999999997
        for i in range(n):
            max_far = max_far + nums[i]
            if max_far> mar:
                mar = max_far
            if(max_far < 0):
                max_far = 0
        #print(mar)
        return mar