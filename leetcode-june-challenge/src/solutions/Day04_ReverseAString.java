package solutions;

public class Day04_ReverseAString {

	public void reverseString(char[] str) {
		int start = 0, end = str.length - 1;

		while (start < end) {
			char temp = str[end];
			str[end] = str[start];
			str[start] = temp;
			start++;
			end--;
		}
	}
}
