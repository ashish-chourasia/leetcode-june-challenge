package solutions;

public class Day11_SortColors {

	// Store the counts of 0, 1, 2. Then populate the array depending on the counts
	// Two pass, O(m+n) space
	public static void sortColors(int[] nums) {
		int num0 = 0, num1 = 0, num2 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				num0++;
			} else if (nums[i] == 1) {
				num1++;
			} else {
				num2++;
			}
		}

		// Set 0's
		for (int i = 0; i < num0; i++) {
			nums[i] = 0;
		}

		// Set 1's
		for (int i = 0; i < num1; i++) {
			nums[num0 + i] = 1;
		}

		// Set 2's
		for (int i = 0; i < num2; i++) {
			nums[num0 + num1 + i] = 2;
		}

		printArray(nums);
	}
	
	// One pass in-place solution
	public static void sortColorsOnePass(int[] nums) {
		int start = 0, end = nums.length-1;
		
		for(int i=0; i<=end; i++) {
			// Swap curr and start
			if(nums[i] == 0) {
				int temp = nums[i];
				nums[i] = nums[start];
				nums[start] = temp;
				start++;
			}
			
			// Swap curr and end
			else if(nums[i]==2) {
				int temp = nums[i];
				nums[i] = nums[end];
				nums[end] = temp;
				end--;
				i--;
			}
		}
	}
	

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColors(nums);

	}
	/*
	 * Input: [2,0,2,1,1,0] Output: [0,0,1,1,2,2]
	 */
}
