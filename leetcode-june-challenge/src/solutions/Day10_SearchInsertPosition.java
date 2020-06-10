package solutions;

public class Day10_SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}

		return nums.length;
	}

	public static int searchInsertBinarySearch(int[] nums, int target) {
		int start = 0, end = nums.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			// Increment from start side
			if (nums[mid] < target) {
				start = mid + 1;
			}
			// Decrement from end side
			else {
				end = mid - 1;
			}
		}

		return start;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		System.out.println(searchInsert(nums, target));
		System.out.println(searchInsertBinarySearch(nums, target));
	}
}
