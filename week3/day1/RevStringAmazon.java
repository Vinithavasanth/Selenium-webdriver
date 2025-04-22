package week3.day1;

public class RevStringAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Amazon development centre Chennai ";
		String lowerCase = input.toLowerCase();
		String[] split = lowerCase.split(" ");
		System.out.println("Reversed String:");
		   for (int n=split.length-1;n>=0;n--) {
			   System.out.print(split[n]);
		   }
		 }
		   
		
	}
