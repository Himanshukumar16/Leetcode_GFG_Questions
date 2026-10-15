class Solution {
    public int sumCounts(List<Integer> nums) {
        int square = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                Set<Integer> map = new HashSet<>();
                for (int k = i; k <= j; k++) {
                    map.add(nums.get(k));
                }
                int n = map.size();
                square += n * n;
            }
        }
        return square;
    }
}