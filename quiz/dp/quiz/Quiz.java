package a_algorithm.dp.quiz;

public class Quiz {
	public static void main(String[] args) {
		q1(new int[] {10, -4, 3, 1, 5, 6, -35, 12, 21, -1});
	}

	private static void q1(int[] arr) {
		
		int currentSum = 0;
		int maxSum = 0;
		
		for (int i : arr) {
			currentSum = Math.max(currentSum + i, i);
			maxSum = Math.max(maxSum, currentSum);
		}
		System.out.println(maxSum);
	}
}
