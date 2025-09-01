package greedy.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Quiz {

	public static void main(String[] args) {
		q1(3465);
		q2();
	}

	private static void q2() {
		List<Meeting> meetings = createMeetings();
		List<Meeting> timetable = new ArrayList<Meeting>();
		Collections.sort(meetings);
		
		timetable.add(meetings.getFirst());
		meetings.removeFirst();
		
		for (Meeting meeting : meetings) {
			if(meeting.getStartAt() >= timetable.getLast().getEndAt()) {
				timetable.add(meeting);
			}
		}
		System.out.println(timetable);
	}

	private static List<Meeting> createMeetings() {
		List<Meeting> meetings = new ArrayList<Meeting>();
		

		meetings.add(new Meeting("개발",1,10));
		meetings.add(new Meeting("기획",5,6));
		meetings.add(new Meeting("인사",13,15));
		meetings.add(new Meeting("총무",14,17));
		meetings.add(new Meeting("QA",8,14));
		meetings.add(new Meeting("CS",3,12));
		
		return meetings;
	}

	private static void q1(int price) {
		Map<Integer, Integer> coinMap = new LinkedHashMap<>();
		
		coinMap.put(500, 0);
		coinMap.put(100, 0);
		coinMap.put(50, 0);
		coinMap.put(10, 0);
		coinMap.put(1, 0);
		
		for (int coin : coinMap.keySet()) {
			coinMap.put(coin, price/coin);
			price %= coin;
		}
		
		for (int coin : coinMap.keySet()) {
			System.out.printf("%d 동전 %d개 \n", coin, coinMap.get(coin));
		}
	}

}
