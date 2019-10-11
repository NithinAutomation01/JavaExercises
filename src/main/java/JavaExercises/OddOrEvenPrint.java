package JavaExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class OddOrEvenPrint {

	public static void main(String[] args) {
		ArrayList<Integer> aleven = new ArrayList<Integer>();
		ArrayList<Integer> alodd = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of numbers you want to check");
		int value= sc.nextInt();
		for(int i =1;i<=value;i++) {
			if(i%2==0) {
	/*			System.out.println("odd number :" +i);*/
				aleven.add(i);

			}else {
				alodd.add(i);
			}
		}
		System.out.println("list of Even numbers are as follows");
		
		for(Integer a : aleven) {
			
			System.out.println(a);
		}System.out.println("list of odd numbers are as follows");
		for(Integer ab : alodd) {
			
			System.out.println(ab);
		}
	}
	

}
