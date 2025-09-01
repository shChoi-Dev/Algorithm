package a_algorithm.bruteforce.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		q1(5);
		q2();
	}

	private static void q2() {
		List<Integer> dwarfs = new ArrayList<Integer>(nineDwarfs());
		int sum = dwarfs.stream().mapToInt(e -> e).sum();
		int diff = sum - 100;
		
		boolean flg = false;
		for (int i = 0; i < dwarfs.size() - 1; i++) {
			if(flg) break;
			for (int j = 1; j < dwarfs.size(); j++) {
				Integer n = dwarfs.get(i);
				Integer k= dwarfs.get(j);
				
				if(diff == n + k) {
					dwarfs.remove(n);
					dwarfs.remove(k);								
					flg = true;
					break;
				}
			}
		}
		System.out.println(dwarfs);
	}
	
	
		
		
	private static List<Integer> nineDwarfs() {
		List<Integer> dwarfs = new ArrayList<Integer>();
		Random random = new Random();
		
		int sum = 0;
		while(dwarfs.size() < 6) {
			int n = random.nextInt(9, 15);
			sum += n;
			dwarfs.add(n);			
		}


		dwarfs.add(100-sum);
		dwarfs.add(random.nextInt(999999));
		dwarfs.add(random.nextInt(9999999));
		return dwarfs;
	}

	private static void q1(int n) {
		List<Integer> doomNumbers = new ArrayList<Integer>();
		
		for(int doom=666, cnt=0; cnt < n; doom++) {
			if(String.valueOf(doom).contains("666")) {
				cnt++;
				doomNumbers.add(doom);
			}
		}
		System.out.println(doomNumbers);
		System.out.println("n : " + doomNumbers.getLast());
		
	}
}
