class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        int[] c = new int[26];
        for(char i : p.toCharArray()){
            c[i - 'a']++;
        }
        int left=0;
        int right = 0;
        int count = p.length();
        while(right<s.length()){
            if(c[s.charAt(right++) - 'a']-- >= 1) count--;
            if(count == 0) res.add(left);
            if(right - left == p.length() && c[s.charAt(left++) - 'a']++ >= 0) count++;
        }
        return res;
    }
}