package ThreadsConcept;

public class ThreadExe {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = new ClassB();
	ClassC c = new ClassC();
	Thread t1 = new Thread(a);
	Thread t2 = new Thread(b);
	Thread t3 = new Thread(c);
	t1.start();
	t2.start();
	t3.start();
				

	}

}
