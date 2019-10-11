package JavaExercises;

public class StringSplit {

	public static void main(String[] args) {
		String text = "Nithin,address of Nithin,234,GXXindia & Karthik,address of karthik,256,Perficient";
		String[] text_induvidual_Emp = text.split("&");
		for(int i =0;i<text_induvidual_Emp.length;i++) {
		/*System.out.println(text_induvidual_Emp[i]);*/
		String[] induvidual_Field = text_induvidual_Emp[i].split(",");
				/*for(int j =0;j< induvidual_Field.length;j++) {*/
					System.out.println(induvidual_Field[1]);
				}
		
		}
	
}
