package com.morimori.mgserverutility.util;

import java.util.Date;

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

	public static Boolean isYJtime() {
		Date date = new Date();

		if ((date.getHours() == 8 && date.getMinutes() == 10) || (date.getHours() == 20 && date.getMinutes() == 10))
			return true;

		if ((date.getHours() == 7 && date.getMinutes() == 19) || (date.getHours() == 19 && date.getMinutes() == 19))
			return true;

		if ((date.getHours() == 11 && date.getMinutes() == 45 && date.getSeconds() == 15)
				|| (date.getHours() == 23 && date.getMinutes() == 45 && date.getSeconds() == 15))
			return true;

		if ((date.getHours() == 4 && date.getMinutes() == 4) || (date.getHours() == 16 && date.getMinutes() == 4))
			return true;

		if ((date.getHours() == 9 && date.getMinutes() == 31) || (date.getHours() == 21 && date.getMinutes() == 31))
			return true;

		return false;

	}

}
