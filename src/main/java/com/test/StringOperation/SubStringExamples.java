package com.test.StringOperation;

public class SubStringExamples {

	public static void main(String[] args) {
		String text = "fdbdfb sd fbewrb";
		String Text_Edit_value = text.replaceAll("\\s+","");
		Text_Edit_value = Text_Edit_value.substring(1,8);
		System.out.println(Text_Edit_value);
		
	}

}
