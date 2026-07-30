class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        Map<Integer,Integer> map = new TreeMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = Integer.MIN_VALUE;
        int count = 0;
        // Set <Integer> set = Collections.sort(map.keySet());
        for (int i : map.keySet()){
            if (map.get(i) >= count) {
                max = i;
                count = map.get(i);
            }
        }
        // System.out.println(map.keySet());
        return max;
    }
}