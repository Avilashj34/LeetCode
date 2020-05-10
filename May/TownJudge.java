class TownJudge {
    public int findJudge(int N, int[][] trust) {
        int[] a = new int[N+1];
        for(int[] i: trust){
            a[i[0]]--;
            a[i[1]]++;
        }
        for(int i = 1; i<=N;i++){
            //System.out.println(a[i]);
            if(a[i] == N-1){
                return i;
            }
        }
        return -1;
    }
}


Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
Output: 3

Input: N = 1, trust = []
Output: 1

Input: N = 3, trust = [[1,3],[2,1]]
Output: -1

Alternate Solution:
1. Define array with N+1 size with element 1,2,3...N+1
2. check the 1st element of every array and remove the same from the defined array
3. Return the 'array element' if defined array is null or defined array length is not equal to N else return '-1'