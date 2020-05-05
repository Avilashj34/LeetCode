class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = -1;
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for(char c: s.toCharArray()){
            if(map.get(c) == 1){
                //System.out.println(map.get(c));
                i = s.indexOf(c);
                break;
            } 
        }
        //System.out.println(i);
        return i;
    }
}