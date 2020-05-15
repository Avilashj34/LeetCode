class Solution {
    public int maxsum(int[] a){
        int max_so_far = a[0], max_here = a[0];
        for(int i = 1; i< a.length; i++){
            max_here = Math.max(a[i],max_here + a[i]);
            max_so_far= Math.max(max_here, max_so_far);
        }
        return max_so_far;
    }
    public int maxSubarraySumCircular(int[] A) {
        int cs=0;
        int k = maxsum(A);
        for(int i = 0; i<A.length; i++){
            cs+=A[i];
            A[i] = -A[i];
        }
        System.out.println(cs+"k value  "+k);
        cs = cs + maxsum(A);
        System.out.println(cs);
        if(cs>k && cs!=0){
            return cs;
        }
        else{
            return k;
        }
    }
}


Example 3:

Input: [3,-1,2,-1]
Output: 4
Explanation: Subarray [2,-1,3] has maximum sum 2 + (-1) + 3 = 4
Example 4:

Input: [3,-2,2,-3]
Output: 3
Explanation: Subarray [3] and [3,-2,2] both have maximum sum 3
Example 5:

Input: [-2,-3,-1]
Output: -1
Explanation: Subarray [-1] has maximum sum -1