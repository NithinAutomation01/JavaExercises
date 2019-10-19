package JavaExercises;

public class Navistestcase {

	

	       public static void main(String[] args) {
	             int arr[] = { 5, 1, 3 };

	             int sum = 0;
	             for (int i = 0; i < arr.length; i++) {

	                    for (int j = 0; j < arr.length; j++) {

	                          if (arr[i] != arr[j]) {
	                                 /*System.out.println("arr[i] " + arr[i]);
*/
	                                 sum += (arr[j] * arr[j]);

	                          }
	                    }

	                    System.out.println("sum:  " + sum);
	                    sum = 0;
	             }
	       }

	}

