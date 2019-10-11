package JavaExercises;

public class StringBufferExamples {



	public static void main(String[] args) {
		String value ="Nithin,KArthik,prakash,ramesh";
		String test ="";
		StringBuffer sb;
		String value1[] =value.split(",");
		for(int i =0;i<value1.length;i++) {
			sb = new StringBuffer(value1[i]);
			sb.append(" Devarajan");
			test= test +sb;
			System.out.println("-----------------");
			System.out.println("  " +test + " ");
			
		}
		

	}

}
