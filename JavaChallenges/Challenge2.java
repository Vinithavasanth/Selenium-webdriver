package JavaChallenges;

public class Challenge2 {
	
	public static int lastword(String s ) {
		String[] split = s.trim().split("\\s+");
		return split[split.length-1].length();
	}
	

	public static void main(String[] args) {
		System.out.println(lastword("fly me   to   the moon"));

	}

}
