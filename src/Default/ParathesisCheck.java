package Default;
import java.util.*;

class ParathesisCheck {
	public static boolean isMatch(String expressionLine) {
		ArrayDeque<Character> ad = new ArrayDeque<Character>();
		for (int i = 0; i < expressionLine.length(); i++) {
			char s = expressionLine.charAt(i);
			if (s == '(' || s == '{' || s == '[')
				ad.push(s);
			else {
				switch (s) {
				case ')':
					if (ad.isEmpty() || ad.peek() != '(')
						return false;
					ad.pop();
					break;

				case '}':
					if (ad.isEmpty() || ad.peek() != '{')
						return false;
					ad.pop();
					break;

				case ']':
					if (ad.isEmpty() || ad.peek() != '[')
						return false;
					ad.pop();
					break;
				}
			}
		}
		return ad.isEmpty();
	}
}