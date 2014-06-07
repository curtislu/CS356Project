public class Example extends Thread {
	private static int cnt = 0;
	public void run() {
		int y = cnt;
		cnt = y + 1;
	}
	public static void main(String args[]) {
		Thread t1 = new Example();
		Thread t2 = new Example();
		t1.start();
		t2.start();
	}
}
