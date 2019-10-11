package JavaExercises;

public class ReverseString {

	public static void main(String[] args) {
		String Name ="Nithin Devarajan";
		String temp = "";
		for(int i =Name.length()-1;i>=0;i--) {
			temp = temp + Name.charAt(i);
		}
		System.out.println(temp);
	}

}
