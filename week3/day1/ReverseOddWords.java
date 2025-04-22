package week3.day1;

public class ReverseOddWords {

    public static void main(String[] args) {
    	String test = "I am a software tester";
        // Split the words and store them in an array
        String[] split = test.split(" ");
        
        // Traverse through each word
        for (int i = 0; i < split.length; i++) {
            
            if (i % 2 != 0) { // Odd position
                // Reverse the word
                for (int j = split[i].length() - 1; j >= 0; j--) {
                    System.out.print(split[i].charAt(j));
                }
            } else {
                // Print the word as-is
                System.out.print(split[i]);
            }
            System.out.print(" "); 
        }
    }
}