package solutions;

import java.util.Arrays;

public class Day03_TwoCityScheduling {

	public static int twoCitySchedCost(int[][] costs) {
		int N = costs.length / 2;
		int[] refund = new int[N * 2];
		int minCost = 0, index = 0;
		for (int[] cost : costs) {
			refund[index++] = cost[1] - cost[0];
			minCost += cost[0];
		}
		Arrays.sort(refund);
		for (int i = 0; i < N; i++) {
			minCost += refund[i];
		}
		return minCost;
	}

	public static void main(String[] args) {
		int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
		System.out.println(twoCitySchedCost(costs));
	}
	/*
	 * Input: [[10,20],[30,200],[400,50],[30,20]]
	Output: 110
	Explanation: 
	The first person goes to city A for a cost of 10.
	The second person goes to city A for a cost of 30.
	The third person goes to city B for a cost of 50.
	The fourth person goes to city B for a cost of 20.
	
	The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
	 */
	
	
	/*
	 * EXPLANATION:-
		The problem is to send n persons to city A 
		and n persons to city B with minimum cost.
		
		The idea is to send each person to city A.
		costs = [[10,20],[30,200],[400,50],[30,20]]
		
		So, totalCost = 10 + 30 + 400 + 30 = 470
		
		Now, we need to send n persons to city B.
		Which persons do we need to send city B?
		
		Here, we need to minimize the cost.
		We have already paid money to go to city A.
		So, Send the persons to city B who get more refund
		so that our cost will be minimized.
		
		So, maintain refunds of each person
		refund[i] = cost[i][1] - cost[i][0]
		
		So, refunds of each person
		    refund = [10, 170, -350, -10]
		
		Here, refund +ve means we need to pay
		             -ve means we will get refund.
		
		So, sort the refund array.
		
		refund = [-350, -10, 10, 170]
		
		Now, get refund for N persons,
		totalCost += 470 + -350 + -10 = 110
		
		So, minimum cost is 110

	 */
}
