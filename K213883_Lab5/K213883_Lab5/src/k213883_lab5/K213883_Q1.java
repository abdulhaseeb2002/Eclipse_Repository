package k213883_lab5;
 
import java.util.Scanner;
 
public class K213883_Q1 {
	static Scanner scan = new Scanner(System.in);
	static String str;
	static char ch[];
	static int len;
 
	public static void main(String[] args) throws LetterException {
		int count;
		do {
			System.out.print("Enter string : ");
			str = scan.next();
			len = str.length();
			ch = str.toCharArray();
			count = 0;
			for (int i = 0; i < len; i++) {
				if (Character.isUpperCase(ch[i]))
					count++;
				if (i == len - 1 && count < len)
					System.out.println("Please enter valid input!");
			}
 
		} while (count != len);
 
		try {
			CheckLetter();
		} catch (LetterException e) {
			System.out.println(e.getMessage());
		}
	}
 
	public static void CheckLetter() throws LetterException {
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == 'A' || ch[i] == 'B') {
				if (ch[i] == 'A')
					throw new LetterException("A");
				else
					throw new LetterException("B");
			}
		}
	}
}
 
class LetterException extends Exception {
	public LetterException(String message) {
		super(message);
	}
}
 