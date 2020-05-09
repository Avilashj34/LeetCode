class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            cnt.put(arr[i],cnt.getOrDefault(arr[i] - difference, 0)+1);
        }
        int res = 1;
        for(Integer i:cnt.values()){
            res = Math.max(res,i);
        }
        System.out.println(cnt.values());
        return res;
    }
}




Input: arr = [1,5,7,8,5,3,4,2,1], difference = -2
Output: 4
Explanation: The longest arithmetic subsequence is [7,5,3,1].