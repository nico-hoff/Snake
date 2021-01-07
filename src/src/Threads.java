
public class Threads extends Thread {
	public int shared;

	@Override
	public void run() {
		shared = 1;
	}

	public static void main(String[] args) {
		Threads myThread = new Threads();
		Thread myThread2 = new Threads();

		//myThread.run();
	}
}

class MyThread implements Runnable {
	Threads theThread = new Threads();
	int shared;
	@Override
	public synchronized void run() {
		theThread.shared = 1;
	}
}

class MyThread2 implements Runnable {

	@Override
	public synchronized void run() {
		if (shared == 0)
			System.out.println("MyThread2 response");
	}
}
