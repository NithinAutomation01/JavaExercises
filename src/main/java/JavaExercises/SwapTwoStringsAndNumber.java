package JavaExercises;

public class SwapTwoStringsAndNumber {

	public static void main(String[] args) {
		int a  = 10;
		int b = 20;
		 a = a+b; // 10 +20 a =30
		 b= a-b; // 30 -10 b =10
		 a = a-b; // 30 - 10 a =20 
		 
System.out.println(+a+" "+b);

String First_String = "Nithin";
String Second_String = "Karthick";
 First_String = First_String+Second_String;
//concatinate String One and Two
 System.out.println(First_String); 
//Stores the value of the First String in the second string by removing theFirst String content
	
 Second_String = First_String.substring(0,First_String.length()-Second_String.length()); //(NithinKarthick - karthick)(0 ,(14-8))
 First_String = First_String.substring(Second_String.length());// (14-6) starts from 6 
 System.out.println("First String is : "+First_String+ " Second String is : "+Second_String);
	
	
	
	
	}

}
