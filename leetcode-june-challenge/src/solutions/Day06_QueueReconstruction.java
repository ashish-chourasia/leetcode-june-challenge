package solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Day06_QueueReconstruction {
	/*
	 * Pick out tallest group of people and sort them in a subarray (S). 
	 * Since there's no other groups of people taller than them, therefore each guy's index will be just as same as his k value.
	   For 2nd tallest group (and the rest), insert each one of them into (S) by k value. So on and so forth.
	 */
	public static int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
		List<int[]> list = new LinkedList<>();
		for (int[] p : people) {
			list.add(p[1], p);
		}
//		printList(people);
		return list.toArray(new int[list.size()][]);
	}
	
//	private static void printList(int[][] people) {
//		for(int[] p: people) {
//			System.out.println("Element: "+p[0]+": "+p[1]);
//		}
//	}
	
	public static void main(String[] args) {
		int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		System.out.println(reconstructQueue(people));
	}

}
