package week3.day2;

public class Elements extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Use Button
		Button bttn= new Button();
		bttn.click();
		bttn.setText("Submit Form");
		bttn.click();
		
		//Use TextField
		TextField tf = new TextField();
		tf.setText(tf.getText());
		System.out.println(tf.getText());
		
		//CheckBoxButton
		CustomButton cbb = new CustomButton();
		cbb.click();
		cbb.submit();
		cbb.clickCheckButton();
		System.out.println();
		
		//RadioButton
		RadioButton rb = new RadioButton();
		rb.click();
		rb.submit();
		rb.electRadioButton();
		System.out.println();
		
		
		
		
				
		

	}

}
