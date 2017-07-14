/*
 * Vandana
 * 11 jul 2017
 * Not A String Challenge
 */
public class NotAStringChallenge {

	public static void main(String args[]) {
		NotAStringChallenge n = new NotAStringChallenge();
		System.out.println(n.notAString("going to happen"));
		System.out.println(n.notAString("a"));
		System.out.println(n.notAString("not interested"));
	}

	public String notAString(String str) {
		String str1 = "not";

		if (str.length() >= 3 && str.substring(0, 3).equals(str1)) {
			return str;
		}
		return str1 + " " + str;
	}

}
