package JavaExercises;

public class SwitchCase {

	public void SwitchcaseExample(int choice){
		switch(choice) {
		case 1:
			System.out.println("case 1 is selected");
			break;
		case 2: 
			System.out.println("case 2 is selected");
			break;
		case 3:
			System.out.println("case 3 is selected");
			break;
		case 4: System.out.println("case 4 is selected");
		break;
		default :
			System.out.println("default");
		}
	}



	public static void main(String[] args) {




		SwitchCase c = new SwitchCase();
		for(int i =1 ; i<=2 ;i++) {
			c.SwitchcaseExample(i);
		}

	}
}
