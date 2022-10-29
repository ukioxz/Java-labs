
public class Lab3 {
	public static void main(String[] args) {
		String str = "Cheesecake is one of the most beloved desserts around "
				+ "the globe. While many of us are acquainted with the fact that this creamy "
				+ "dessert has its roots seated in New York, the fact is it actually dates back "
				+ "much further.";
		
		String removeComma = str.replaceAll(",","");
		String removePoint = removeComma.replace(".","");

		String[] words = removePoint.split(" ");
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
