class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int[] ans = {-1,-1};
        int ind = 0;
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                ans[ind] = i;
                ind++;
            }
        }
        return ans;
    }
}