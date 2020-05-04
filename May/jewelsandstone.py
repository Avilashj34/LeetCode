class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        c = 0
        for i in S:
            if i in J:
                c+=1
        return c