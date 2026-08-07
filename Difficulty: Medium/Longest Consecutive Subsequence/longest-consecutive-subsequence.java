class Solution {
    public int longestConsecutive(int[] nums) {
        // code here
        Set<Integer> set = new HashSet<>();
        int currCount = 0;
        int longest = 1;
        for (int i : nums) {
            set.add(i);
        }
        for (int i : set) {
            // System.out.print(i+" ");
            if (set.contains(i-1)) continue;
            else {
                while (set.contains(i)) {
                    currCount++;
                    i++;
                }
                longest = Math.max(currCount,longest);
            }
            currCount = 0;
        }
        return longest;
    }
}