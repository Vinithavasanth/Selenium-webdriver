package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		//Convert the given String to a character array.
		char[] charArray = test.toCharArray();
		//loop to iterate each char
		for (int i=0; i<charArray.length;i++) {
			if(i%2!=0) {
				charArray[i]=Character.toUpperCase(charArray[i]);
			}
		}
		String result = new String(charArray);
	    System.out.println("Modified string: " + result);
			
		}

	}


