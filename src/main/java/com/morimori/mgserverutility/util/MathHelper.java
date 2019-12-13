package com.morimori.mgserverutility.util;

public class MathHelper {
	public static int StringDecimalConverter(String name) {

		int k = 0;
		int m = 1;
		for (char c : name.toCharArray()) {

			k = k + ((int) c * m);
			m = m + 3;
		}
		return k;
	}
}
