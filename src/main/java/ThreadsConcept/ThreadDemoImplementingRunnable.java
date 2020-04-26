package ThreadsConcept;

class test1 implements Runnable{
	public void run(){
	for(int i =0;i<6;i++){
		System.out.println("Hi");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}
	
}
class test2 implements Runnable{
	public void run(){
		for(int i =0;i<6;i++){
			System.out.println("Hello");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}
	
}
public class ThreadDemoImplementingRunnable {

	public static void main(String[] args) throws InterruptedException {
		/*test1 hi =new test1();
		test2 hello = new test2();*/
		
		Runnable hi = new test1();// A obj1 = new A();
		Runnable hello = new test2(); // B obj2 = new B();
		
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(hello);
		t1.start();		
		t2.start();

	}

}
