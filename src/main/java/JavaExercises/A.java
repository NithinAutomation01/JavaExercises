package JavaExercises;

import java.util.Map;

public class A {
	public static void main(String args[]) {
		int a = 153;
		int rev=0;
		int b =153;
		a = a+b;
		b = a-b;
		a= a-b;
		int arm =0;
		System.out.println(a);
		System.out.println(b);
		String name ="Nithin";
		String game = "karthik";
	 name = name +game;
	 System.out.println(name);
	 game = name.substring(0, name.length()-game.length());
	 name = name.substring(game.length());
	 System.out.println(name);
		System.out.println(game);
		
		for(int i =2;i<a/2;i++) {
			if(a%i== 0) {
					System.out.println("Non prime");
					break;
			}else {
				System.out.println("prime");
			}
			
		}
		
		while(a>0) {
			int k = a%10;
			rev = rev*10+k;
			arm = arm+(k*k*k);
			a = a/10;
			
		}
		System.out.println(rev);
		System.out.println(arm);
		
				int  value = 678;int sum=0;int sum1=0;
				while(value>0) {
					int k = value%10;
					sum = sum +k;
					value =value/10;
				}
				while (sum>0) {
					int j = sum%10;
					sum1 = sum1+j;
				}
				System.out.println(sum1);
			}

		

	
}


