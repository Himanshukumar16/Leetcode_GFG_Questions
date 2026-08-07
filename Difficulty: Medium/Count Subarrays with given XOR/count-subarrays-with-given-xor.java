class Solution {
    public long subarrayXor(int nums[], int k) {
        // code here
        int xor = 0;
        long cnt = 0;
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
            if (map.containsKey(xor ^ k)) {
                cnt += map.get(xor^k);
            }
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return cnt;
    }
}