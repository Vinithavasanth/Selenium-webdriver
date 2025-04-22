package week3.day1;

public class CountOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="TestLeaf";
		class FindCharCount {
            void countE() {
                int count = 0;
                char[] charArray = input.toCharArray();

                for (int i = 0; i < charArray.length; i++) {
                    if (charArray[i] == 'e') {
                        count++;
                    }
                }

                System.out.println("Count of 'e': " + count);
            }
        }

        // Create an object of the local class and call the method
        FindCharCount obj = new FindCharCount();
        obj.countE();
    }
}
