package task9prog;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalStr = "Geek in Guvi";
		String reversedStr = " ";

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}
        System.out.println("Original string: " + originalStr);
		System.out.println("Reversed string: "+ reversedStr);
	}

}
