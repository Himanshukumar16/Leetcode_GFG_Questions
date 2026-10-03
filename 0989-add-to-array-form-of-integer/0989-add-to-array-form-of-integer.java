class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int carry = 0;
        
        for (int i = num.length-1; i >= 0; i--) {
            int last = k % 10;
            ans.addFirst((last+num[i]+carry)%10);
            carry = (last+num[i]+carry) / 10;
            k = k / 10;
        }

        if (k != 0) {
            while (k != 0) {
                ans.addFirst((k % 10 + carry)% 10);
                carry = (k % 10 + carry) / 10;
                k = k / 10;
            }
        }

        if (carry != 0) {
            ans.addFirst(carry);
        }

        return ans;
    }
}