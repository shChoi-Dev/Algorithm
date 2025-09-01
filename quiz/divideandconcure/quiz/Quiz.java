package a_algorithm.divideandconcure.quiz;

public class Quiz {

	public static void main(String[] args) {
		System.out.println(q1(2, 10));

	}

	private static int q1(int i, int j) {
		if(j==0) return 1;
		if(j==1) return i;
		
		int half = q1(i, j/2);
		
		if(j % 2 == 0) {
			return half * half;
		}else {
			return half * half * i;
		}

	}

}
