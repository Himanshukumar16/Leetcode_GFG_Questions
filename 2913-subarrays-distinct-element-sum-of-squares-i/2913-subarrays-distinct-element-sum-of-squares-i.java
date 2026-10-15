class Solution {
    public int sumCounts(List<Integer> nums) {
        int square = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                Map<Integer, Integer> map = new HashMap<>();
                for (int k = i; k <= j; k++) {
                    map.put(nums.get(k), map.getOrDefault(nums.get(k),0)+1);
                }
                int cnt = 0;
                for (int key : map.keySet()) {
                    cnt++;
                }
                square += cnt * cnt;
            }
        }
        return square;
    }
}