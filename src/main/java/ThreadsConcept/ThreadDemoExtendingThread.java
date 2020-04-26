package ThreadsConcept;

class Hi extends Thread{
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
	
}class Hello extends Thread{
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
public class ThreadDemoExtendingThread {

	public static void main(String[] args) throws InterruptedException {
		Hi hi =new Hi();
		Hello hello = new Hello();
		hi.start();		
		hello.start();

	}

}
