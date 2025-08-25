package com.mc.algorithm.g_divideandconcure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Meeting {
	int id;
	int start;
	int end;
	
	public Meeting(int id, int start, int end) {
		this.id = id;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString() {
		return "회의 " + id + " (" + start + "~" + end + ")";
	}
}

public class GreedyQuiz2 {

	public static void main(String[] args) {
		 List<Meeting> meetings = new ArrayList<>(Arrays.asList(
		            new Meeting(1, 1, 10),
		            new Meeting(2, 5, 6),
		            new Meeting(3, 13, 15),
		            new Meeting(4, 14, 17),
		            new Meeting(5, 8, 14),
		            new Meeting(6, 3, 12)
		        ));
		 
		 Collections.sort(meetings, new Comparator<Meeting>() {
			 @Override
			 public int compare(Meeting m1, Meeting m2) {
				 if(m1.end == m2.end) {
					 return m1.start - m2.start;
				 }
				 return m1.end - m2.end;
			 }
		 });
		 
		 List<Meeting> schedule = new ArrayList<>();
		 int lastEndTime = 0;
		 
		 for (Meeting meeting : schedule) {
			if(meeting.start >= lastEndTime) {
				schedule.add(meeting);
				lastEndTime = meeting.end;
			}
		}
		 
		 System.out.println("배정 가능한 최대 회의 개수: " + schedule.size());
	        System.out.println("선택된 회의 목록:");
	        for (Meeting m : schedule) {
	            System.out.println(m);
	        }
	}

}
