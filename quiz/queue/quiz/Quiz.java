package a_algorithm.queue.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
	public static void main(String[] args) {
		q1(10);
		q2(7, 3);
	}

	private static void q2(int n, int k) {
		_Queue<Integer> persons = new _Queue<Integer>();
		List<Integer> removed = new ArrayList<Integer>();
		
		for (int i = 0; i <= n; i++) {
			persons.enqueue(i);
		}
		
		while(persons.size() > 1) {
			for (int i=0; i < k-1; i++) {
				persons.enqueue(persons.dequeue());
			}
			
			removed.add(persons.dequeue());
		}
		
		System.out.println("removed : " + removed);
		System.out.println("alive : " + persons.dequeue());
	}

	private static void q1(int n) {
		_Queue<Integer> cards = new _Queue<Integer>();
		List<Integer> trashBox = new ArrayList<>();
		
		
		for (int i=1; i<n; i++) {
			cards.enqueue(i);
		}
		
		while(cards.size() > 1) {
			trashBox.add(cards.dequeue());
			//cards.add(cards.dequeue());
		}
		
		System.out.println("trashBox : " + trashBox);
		System.out.println("cards : " + cards.dequeue());
		
	}
}
