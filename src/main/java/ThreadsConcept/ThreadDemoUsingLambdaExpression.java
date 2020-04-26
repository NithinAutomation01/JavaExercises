package ThreadsConcept;


public class ThreadDemoUsingLambdaExpression {

	public static void main(String[] args) throws InterruptedException {
		// A obj1 = new A();
		Runnable obj1 = ()->
			       {
				     for(int i =0;i<6;i++)
				     			{
					System.out.println("Hi");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				     			}};


					// B obj2 = new B();
					Runnable obj2 = ()->{
							for(int i =0;i<6;i++){
								System.out.println("Hello");
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								}};




								Thread t1 = new Thread(obj1);
								Thread t2 = new Thread(obj2);
								t1.start();		
								t2.start();
								System.out.println(t1.isAlive());
								System.out.println(t2.isAlive());
								t1.join();
								t2.join();
								System.out.println(t1.isAlive());
								System.out.println(t2.isAlive());
								System.out.println("bye"); // execution of the main thread

		}

	}
