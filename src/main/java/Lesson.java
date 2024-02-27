public class Lesson {
	public static boolean q1_inRow (Queue <Integer> que, int num) {
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
	public static <T> Queue<T> q3_deleteDuplicates(Queue<T> q){
		int c = 1;
		q.insert(null);
		while(q.head()!=null) {
			T x = q.head();
			q.insert(q.remove());
			while(q.head()!=null) {
				if(q.head()==x)
					q.remove();
				if(q.head()!=null)
					q.insert(q.remove());
			}
			q.insert(q.remove());
			for (int i = 0; i < c; i++) {
				q.insert(q.remove());
			}
			c++;
		}
		q.remove();
		return q;
	}
	public static void main(String[] args) {
		Queue <Time> que1 = new Queue <Time> ();
		que1.insert(new Time(1,31,42));
		que1.insert(new Time(1,44,12));
		que1.insert(new Time(2,48,35));
		que1.insert(new Time(3,32,51));
		que1.insert(new Time(4,51,0));
		que1.insert(new Time(4,56,37));
		que1.insert(new Time(5,57,42));
		que1.insert(new Time(6,16,15));
		System.out.println(que1);
		System.out.println("The time between the first and the last place is " + q2A(que1));
		System.out.println(que1);
		Queue <Character> que2 = new Queue <Character> ();
		que2.insert('v');
		que2.insert('g');
		que2.insert('o');
		que2.insert('o');
		que2.insert('d');
		que2.insert('p');
		que2.insert('w');
		que2.insert('g');
		System.out.println(q3_deleteDuplicates(que2));
	}

}
