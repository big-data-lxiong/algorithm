package com.xl.digital;

public class XLInteger {

	public int parsInt(String str, int radix) throws Exception {
		int len = str.length();
		boolean negative = false;
		int result = 0;
		int i = 0;

		if (len <= 0) {
			return 0;
		}

		if (len > 0) {
			char firstChar = str.charAt(0);
			if (firstChar < '0') {
				if (firstChar == '-') {
					negative = true;
				} else if (firstChar == '+') {
					negative = false;
				} else {
					throw new Exception("the first char is: " + firstChar);
				}
			}

			while (i < len) {
				char ch = str.charAt(i++);
				int cur = getDidital(ch, radix);
//				int cur = Character.digit(ch, radix);
				result = result * radix + cur;
			}
		}

		return negative ? -result:result;
	}

	private int getDidital(char ch, int radix) throws Exception {
		int r = 0;

		if(48 <= ch && ch <= 57){
			r = ch - 48;
		}

		if(65 <= ch && ch <= 90){
			r = ch - 65 + 10;
		}

		if(97 <= ch && ch <=122){
			r = ch - 97 +10;
		}

		if(r >= radix){
			throw new Exception("" + ch);
		}

		return r;
	}

}
