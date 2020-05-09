class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if num <= 1:
            return True
        l = 2
        r= num
        while(l<=r):
            mid = (l+r) // 2
            square =  mid ** 2
            if square == num:
                return True
            elif square > num:
                r = mid -1
            else:
                l = mid + 1
        return False
        