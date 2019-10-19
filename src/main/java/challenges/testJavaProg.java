package challenges;

public class testJavaProg {

	public static void main(String[] args) {
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
