/* 0402
 C3 = 0 StringBuilder
 C17 = 11
 */
public class Lab3 {
	public static void main(String[] args) {
		String str = "Cheesecake is one of the most beloved "
				+ "desserts around the globe";
		StringBuilder sb = new StringBuilder(str);

		String[] words = sb.toString().split(" ");
		String consStr = "bcdfghjklmnprstvwxyzBCDFGHJKLMNPRSTVWXYZ";
		for (String word : words) {
			char result = word.charAt(0);
			if(consStr.indexOf(result) == -1 && word.length() == 3) {
				System.out.println(word);
			} else {
				//System.out.println("this word starts with a consonant");
				String removeWord = word.replace(word,"");
			}
	    }
	}
}
