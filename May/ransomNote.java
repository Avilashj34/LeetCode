class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> cnt = new HashMap<>();
        for(char c : magazine.toCharArray()){
            cnt.put(c, cnt.getOrDefault(c,0)+1);
        }
        for(char c : ransomNote.toCharArray()){
            if(!cnt.containsKey(c) || cnt.get(c)<=0){
                return false;
            }
            cnt.put(c,cnt.get(c) - 1);
        }
        return true;
    }
}