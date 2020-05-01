#url : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3288/

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]


#Time Limit Exceed
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        n = len(strs)
        l = [True] * n
        s = []
        for i in range(n-1):
            if l[i]:
                a = []
                for j in range(i+1,n):
                    if sorted(strs[i]) == sorted(strs[j]):
                        a.append(strs[j])
                        l[j] = False
                a.append(strs[i])
                s.append(a)
                #l[i] = False
        if l[n-1]:
            a = []
            a.append(strs[n-1])
            s.append(a)
            #l[n-1] = False
        #print(s)
        #print(l)
        return sorted(s)


#Accepted Solution
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)
        for s in strs:
            ans[tuple(sorted(s))].append(s)
            print(ans)
        return ans.values()
     