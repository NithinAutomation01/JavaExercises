package JavaExercises;

public class NavisQuestion {

	public static void main(String[] args) {
		int value[] = {3,5,6,4,6};
		int sum =0;
		System.out.println(value.length);
		for(int i =0;i<value.length;i++) {
			for(int j=0;j<value.length;j++) {
				if(value[i] != value[j]) {
					sum = sum+(j*j);
				}
			}
			
			System.out.print(sum);
			System.out.print(" ");
		}
			
	}

}
