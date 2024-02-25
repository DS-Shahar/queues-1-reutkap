public class Lesson {
	public static boolean inRow (Queue <Integer> que, int num) {
		boolean flag = false;
		que.insert(null);
		while (que.head() != null) {
			if (que.head() == num) {
				que.insert(que.remove());;
			}
			if(que.head() != null) {
				if (que.head() == num) {
					flag = true;
				}
			}
			if (que.head() != null) {
				que.insert(que.remove());
			}
		}
		que.remove();
		return flag;
	}
	public static Time q2A(Queue <Time> q) {
		Time x = q.head();
		Time y = q.head();
		q.insert(null);
		while (q.head() != null) {
			y = q.head();
			q.insert(q.remove());
		}
		q.remove();
		int h,m,s = 0;
		h = y.getHour() - x.getHour();
		if (y.getMinute() > x.getMinute()) {
			m = 60 - x.getMinute();
		}
		else {
			m = 60 - y.getMinute();
		}
		if (y.getSecond() > x.getSecond()) {
			s = y.getSecond() - x.getSecond();
		}
		else {
			s = x.getSecond() - y.getSecond();
		}
		Time r = new Time (h,m,s);
		return r;
	}
	public static void main(String[] args) {
		Queue <Time> que = new Queue <Time> ();
		que.insert(new Time(1,31,42));
		que.insert(new Time(1,44,12));
		que.insert(new Time(2,48,35));
		que.insert(new Time(3,32,51));
		que.insert(new Time(4,51,0));
		que.insert(new Time(4,56,37));
		que.insert(new Time(5,57,42));
		que.insert(new Time(6,16,15));
		System.out.println(que);
		System.out.println("The time between the first and the last place is " + q2A(que));
		System.out.println(que);

	}

}
