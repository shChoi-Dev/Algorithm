package greedy.quiz;

public class Meeting implements Comparable<Meeting> {
	
	private String name;
	private int startAt;
	private int endAt;
	
	public Meeting(String name, int startAt, int endAt) {
		super();
		this.name = name;
		this.startAt = startAt;
		this.endAt = endAt;
	}
	
	public String getName() {
		return name;
	}
	public int getStartAt() {
		return startAt;
	}
	public int getEndAt() {
		return endAt;
	}
	
	@Override
	public String toString() {
		return "Meeting [name=" + name + ", startAt=" + startAt + ", endAt=" + endAt + "]";
	}
	
	@Override
	public int compareTo(Meeting o) {
		return endAt - o.endAt;
	}
	
	
	
	
	
}
