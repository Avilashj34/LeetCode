Algo
n = 6
F F F F T T
left = 1 right = 6
midpoint = 1+ 5/2 = 3
left = 4, right = 6
midpoint = 4 + 2/2 = 5
if true:
right = midpoint = 5
4<5
midpoint = 4 + 0
left = midpoin + 1
left = 5
Condition become false and out of the loop

Full Solution:-


class Solution:
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        left = 1
        right = n
        while(left<right):
            mid = left +(right - left)/2
            if isBadVersion(mid):
                right = mid
            else:
                left = mid + 1
        return int(left) 