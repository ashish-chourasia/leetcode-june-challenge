package solutions;

public class Day08_PowerOfTwo {
 // https://leetcode.com/problems/power-of-two/discuss/63966/4-different-ways-to-solve-Iterative-Recursive-Bit-operation-Math
	public static boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}

		while (n % 2 == 0) {
			n = n / 2;
		}
		if (n == 1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(16));
		System.out.println(isPowerOfTwo(218));
	}

}
