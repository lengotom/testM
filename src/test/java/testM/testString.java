package testM;

public class testString {
	public static void main (String [] args) {
		String s = "this is a test string just to learn some new things";
		
		if (stringCheck(s)) {
			System.out.println(reverse(s));
		}
		else {
			System.out.println("Provided value is not a valid String");
		}
	}
	
	public static boolean stringCheck(String s) {
		String regex = "^[a-zA-Z0-9 ]*$";
		if (!s.matches(regex)) return false;
		if (s.length() <= 0) return false;
		return true;
	}
	
	public static String reverse(String s) {
		String [] temp = s.split("\\s+");
		String out = "";
		for (int i=temp.length-1; i>=0; i--) {
			out += temp[i];
			if (i > 0) out += " ";
		}
		return out;
	}
}
