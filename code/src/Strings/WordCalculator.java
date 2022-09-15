package Strings;

import java.util.*;

public class WordCalculator {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String input = s.nextLine();

		String temp = "", str = "";

		for (int i = 0; i < input.length(); i++) {

			temp += input.charAt(i);

			switch (temp) {

			case "one":
				str += "1";
				temp = "";
				break;

			case "two":
				str += "2";
				temp = "";
				break;

			case "three":
				str += "3";
				temp = "";
				break;

			case "four":
				str += "4";
				temp = "";
				break;

			case "five":
				str += "5";
				temp = "";
				break;

			case "six":
				str += "6";
				temp = "";
				break;

			case "seven":
				str += "7";
				temp = "";
				break;

			case "eight":
				str += "8";
				temp = "";
				break;

			case "nine":
				str += "9";
				temp = "";
				break;

			case "zero":
				str += "0";
				temp = "";
				break;

			case "plus":
				if (i == input.length() - 1) {
					System.out.println(-1);
					s.close();
					return;
				}
				str += "+";
				temp = "";
				break;

			case "minus":
				if (i == input.length() - 1) {
					System.out.println(-1);
					s.close();
					return;
				}
				str += "-";
				temp = "";
				break;

			}

		}

		if (temp.length() > 0) {
			System.out.println(-1);
			s.close();
			return;
		}

		Stack<String> stack = new Stack<>();

		char op = '+';

		int i = 0, j = 0, val = 0;

		while (j <= str.length()) {

			if (j == str.length()) {
				val = 0;
				while (!stack.isEmpty())
					val += Integer.parseInt(stack.pop());
				stack.push("" + val);
				j++;
			} else if (Character.isDigit(str.charAt(j))) {
				i = j;
				while (j < str.length() && Character.isDigit(str.charAt(j)))
					j++;
				val = Integer.parseInt(str.substring(i, j));
				if (op == '-')
					val = -val;
				stack.push("" + val);
			} else if (str.charAt(j) == '+' || str.charAt(j) == '-') {
				op = str.charAt(j++);
			} else {
				j++;
			}
		}

		int value = Integer.parseInt(stack.pop());

		if (value < 0) {
			System.out.println(-1);
			s.close();
			return;
		}

		String numStr = String.valueOf(value);
		temp = "";

		String ans = "";

		for (int k = 0; k < numStr.length(); k++) {

			temp += numStr.charAt(k);

			switch (temp) {

			case "1":
				ans += "one";
				temp = "";
				break;

			case "2":
				ans += "two";
				temp = "";
				break;

			case "3":
				ans += "three";
				temp = "";
				break;

			case "4":
				ans += "four";
				temp = "";
				break;

			case "5":
				ans += "five";
				temp = "";
				break;

			case "6":
				ans += "six";
				temp = "";
				break;

			case "7":
				ans += "seven";
				temp = "";
				break;

			case "8":
				ans += "eight";
				temp = "";
				break;

			case "9":
				ans += "nine";
				temp = "";
				break;

			case "0":
				ans += "zero";
				temp = "";
				break;

			}

		}

		System.out.println(ans);

		s.close();

	}

}
