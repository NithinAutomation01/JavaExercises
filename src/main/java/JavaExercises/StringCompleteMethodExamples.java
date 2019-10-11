package JavaExercises;

public class StringCompleteMethodExamples {

	public static void main(String[] args) {
		String Actual = "Nithin Devarajan";
		String Expected = "Praveen strvatson   ";
		String value = "Nithin";
		String t = "nithin";
		String value1 = "asd";
		// String length gives the number of characters present
		int count_of_Characters = Actual.length();
		System.out.println("list of characters present : " +count_of_Characters);
		// Trim function takes care of the whitespaces both before and
		// after .
		String After_trim = Expected.trim();
		System.out.println("Before trim :" +Expected.length());
		System.out.println("After Trim  : " +After_trim.length());
		// Contains function sees if another string is a subset of the parent string
		
		
		boolean flag = Actual.contains(value);
		System.out.println("Flag hosted from the Boolean : " +flag);
		
		// EqualsIgnore Case - ignores case sensitivity for comparison
		boolean flag1 = value.equalsIgnoreCase(t);
		System.out.println("Flag hosted from boolean for casesensitivity " +flag1);
		
		// starts with ends with
		
		boolean flag3 = value.startsWith("Nith");
		System.out.println(flag3);
		
		
		
	
	}

}
