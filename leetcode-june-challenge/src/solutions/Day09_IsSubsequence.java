package solutions;

public class Day09_IsSubsequence {

	public static boolean isSubsequence(String s, String t) {
		if (s.length() == 0) {
			return true;
		}

		int sIter = 0, tIter = 0;

		while (tIter < t.length()) {
			if (t.charAt(tIter) == s.charAt(sIter)) {
				sIter++;
				if (sIter == s.length())
					return true;
			}
			tIter++;
		}

		return false;
	}

	public static void main(String[] args) {
		String s = "abc", t = "ahbgdc";
//		String s = "axc", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}
//	Input: s = "abc", t = "ahbgdc"
//			Output: true
}
