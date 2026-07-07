class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> lst = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] != nums2[j]) {
                if (nums1[i] < nums2[j]) i++;
                else j++;
            }else {
                lst.add(nums1[i]);
                i++;
                j++;
            }
        } 
        int index = 0;
        int[] answer = new int[lst.size()];
        for (int el : lst) {
            answer[index] = el;
            index++;
        }
        return answer;
    }
}