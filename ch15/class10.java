/*²Ä10ÃD
 * 
 */
class CTest3 implements Runnable {
	private String id;

	public CTest3(String str) {
		id = str;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep((int) (2000 * Math.random()));
			} catch (InterruptedException e) {
			}
			System.out.println(id + " " + i);
		}
	}
}

public class class10 {

	public static void main(String[] args) {
		CTest3 hi = new CTest3("Hello");
		CTest3 bye = new CTest3("Good bye");
		CTest3 morning = new CTest3("Good morning");
		CTest3 night = new CTest3("Good night");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		Thread t4 = new Thread(night);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
