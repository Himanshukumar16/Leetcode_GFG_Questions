class Solution {
    public int findDiff(int[] nums) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        int highFreq = Integer.MIN_VALUE;
        int lowFreq = Integer.MAX_VALUE;
        for (int i : nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (int i : map.values()) {
            if (i > highFreq) highFreq = i;
            if (i < lowFreq) lowFreq = i;
        }
        return highFreq - lowFreq;
    }
}