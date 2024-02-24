public class Main {

	public static <T> boolean q1_isIn (Queue <T> q, T x){
		Queue <T> q2 = new Queue <T> ();
		boolean flag = false;
		while (!q.isEmpty()) {
			if (q.head().equals(x)) {
				flag = true;
			}
			q2.insert(q.remove());
		}
		while (!q2.isEmpty()) {
			q.insert(q2.remove());
		}
		return flag;
	}
	public static <T> boolean q2 (Queue <T> q, T x){
		q.insert(null);
		boolean flag = false;
		while (q.head() != null) {
			if (q.head().equals(x)) {
				flag = true;
			}
			q.insert(q.remove());
		}
		q.remove();
		return flag;
	}
	public static <T> boolean q3 (Queue <T> q, T x){
		if (q.isEmpty()) {
			return false;
		}
		T a = q.remove();
		boolean flag = q3(q,x);
		q.insert(a);	
		return flag || (a == x);
	}
	public static <T> Queue <Integer> q6 (Queue <T> q){
		Queue <Integer> q2 = new Queue <Integer> ();
		q.insert(null);
		while (q.head() != null) {
			int count = 1;
			T last = q.head();
			q.insert(q.remove());
			if (q.head().equals(last)) {
				count ++;
				last = q.head();
				q.insert(q.remove());
				while (q.head() != null && q.head().equals(last) ) {
					count ++;
					last = q.head();
					q.insert(q.remove());
				}
			}
			q2.insert(count);
		}
		q.remove();
		return q2;
	}
	public static <T> boolean q7 (Queue <T> q){
		Queue <T> q2 = new Queue <T> ();
		boolean flag = false;
		while (!q.isEmpty()) {
			if (countTimes(q,q.head())>1) {
				flag = true;
			}
			q2.insert(q.remove());
		}
		while (!q2.isEmpty()) {
			q.insert(q2.remove());
		}
		return flag;
	}
	public static <T> Queue <T> q8 (Queue <T> q){
		Queue <T> q2 = new Queue <T> ();
		while (!q.isEmpty()) {
			if (countTimes(q,q.head())>1) {
				q.remove();
			}
			q2.insert(q.remove());
		}
		while (!q2.isEmpty()) {
			q.insert(q2.remove());
		}
		return q;
	}
	public static Queue<Integer> q9(Queue<Integer> q){
		q.insert(null);
		Queue<Integer> q2 = new Queue<Integer>();
		int x = q.head();
		q.remove();
		while(!q.isEmpty()) {
			if(q.head()!=null) {
				if(q.head()<x) {
					q.insert(x);
					x = q.head();
					q.remove();
				}
				else
					q.insert(q.remove());
			}
			if(q.head()==null) { 
				q.insert(q.remove());
				if(q.head()==null)
					q.remove();
				else {
					q2.insert(x);
					//q.insert(q.remove());
					x = q.head();
					q.remove();
					if(q.head()==null)
						q2.insert(x);
				}
			}
		}
		return q2;
	}
	public static void main(String[] args) {
		Queue <Character> qu1 = new Queue <Character> ();
		qu1.insert('v');
		qu1.insert('g');
		qu1.insert('o');
		qu1.insert('o');
		Queue <String> qu2 = new Queue <String> ();
		qu2.insert("hello");
		qu2.insert("no");
		qu2.insert("yes");
		qu2.insert("hello");
		qu2.insert("hello");
		qu2.insert("hello");
		System.out.println(qu2);
		System.out.println(q8(qu2));
		//		System.out.println(q1_isIn);
		//		System.out.println(q6(q1_isIn));
		//		System.out.println((q1_isIn));
	}
	public static <T> int countTimes (Queue <T> q, T x){
		q.insert(null);
		int count = 0;
		while (q.head() != null) {
			if (q.head().equals(x)) {
				count++;
			}
			q.insert(q.remove());
		}
		q.remove();
		return count;
	}
}
