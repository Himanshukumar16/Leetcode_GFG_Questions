class Solution {
	public int[] reverseArray(int arr[]) {
		// code here
		arrRev(arr, 0);
		return arr;
	}
	void arrRev(int[] nums, int index) {
		if (index >= nums.length / 2)
			return;
		int temp = nums[index];
		nums[index] = nums[nums.length - 1 - index];
		nums[nums.length - 1 - index] = temp;
		arrRev(nums, index + 1);
	}
}