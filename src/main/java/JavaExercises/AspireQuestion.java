package JavaExercises;
// INPUT : 678 OP 6+7+8 = 21 , 2+1=3
public class AspireQuestion{

	public static void main(String[] args) {
	System.out.println("test");
				int  value = 678;int sum=0;int sum2=0;
				while(value>0) {
					int k = value%10;
					sum = sum +k;
					value =value/10;
				}
				System.out.println(sum);
				int sum1 = sum;
				System.out.println(sum1);
				while (sum1>0) {
					int j = sum1%10;
					sum2 = sum2+j;
					sum1 =sum1/10;
				}
				System.out.println(sum2);
			}
}