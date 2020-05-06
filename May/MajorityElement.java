class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2,ele = 0;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for(int i:nums){
            cnt.put(i, cnt.getOrDefault(i,0) + 1);
        }
        for(int i:nums){
            if(cnt.get(i) > n){
                ele = i;
                break;
            }
        }
        //System.out.println(n+" "+ele);
        return ele;
    }
}