Input: arr = [1,2,3]
Output: 2
Explanation: 1 and 2 are counted cause 2 and 3 are in arr.


class Solution:
    def countElements(self, arr: List[int]) -> int:
        count = 0
        for i in arr:
            j = i+1
            if j in arr:
                count +=1
        return count