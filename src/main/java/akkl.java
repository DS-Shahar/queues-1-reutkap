package test;
public class akkl {
	public static void service_q6 (Queue <Job> q, int time) {
		q.insert(null);
		while (q.head() != null && time != 0 && q.head().getTime()<= time) {
			time = time-q.head().getTime();
			q.remove();
		}
		while (q.head() != null) {
			q.insert(q.remove());
		}
		q.remove();
	}
	public static String q9(Queue <Wolter> q,int cc) {
		q.insert(null);
		String id = "Not found";
		while (q.head() != null && id == "Not found") {
			if (q.head().getCc() >= cc) {
				id = q.head().getId();
				q.remove();
			}
			q.insert(q.remove());
		}
		while (q.head() != null) {
			q.insert(q.remove());
		}
		q.remove();
		return id;
	}
	public static void main(String[] args) {
		Queue <Wolter> qu1 = new Queue <Wolter> ();
		qu1.insert(new Wolter ("715256",465));
		qu1.insert(new Wolter ("234186",720));
		qu1.insert(new Wolter ("654421",540));
		qu1.insert(new Wolter ("231586",690));
		qu1.insert(new Wolter ("876131",465));
		qu1.insert(new Wolter ("321564",600));
		System.out.println(qu1);
		System.out.println(q9(qu1,465));
		System.out.println(qu1);
		Queue <Job> qu2 = new Queue <Job> ();
		qu2.insert(new Job ("715256",20));
		qu2.insert(new Job ("234186",20));
		qu2.insert(new Job ("654421",40));
		qu2.insert(new Job ("231586",50));
		qu2.insert(new Job ("876131",80));
		qu2.insert(new Job ("321564",60));
		System.out.println(qu2);
		service_q6(qu2,180);
		System.out.println(qu2);
	}

}
