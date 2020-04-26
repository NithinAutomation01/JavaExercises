package ThreadsConcept;

public class ThreadExecution {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		Thread threadObj = new Thread(t);
		threadObj.start();
		
	}

}
