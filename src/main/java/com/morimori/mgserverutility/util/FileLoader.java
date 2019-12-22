package com.morimori.mgserverutility.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.morimori.mgserverutility.MGServerUtility;

public class FileLoader {
	public static List<String> loadTextFile(String pass) {
		List<String> list = new ArrayList<String>();
		try {

			FileReader re = new FileReader(pass);
			BufferedReader bre = new BufferedReader(re);
			String st;
			int cont = 0;
			while ((st = bre.readLine()) != null) {
				if (cont != 0)
					list.add(st);

				cont++;
			}
			MGServerUtility.LOGGER.info("Success to read File[" + pass + "]");
			bre.close();
			re.close();

		} catch (IOException ex) {

			MGServerUtility.LOGGER.info("Failed to read File[" + pass + "]");

		}
		return list;

	}

	public static void wirteTextFile(String pass, List<String> list) {
		PrintWriter printwriter = null;

		try {

			FileWriter fw = new FileWriter(pass, false);
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

			try {
				pw.println("-----The first line is not read-----");
				for (String St : list) {
					pw.println(St);
					MGServerUtility.LOGGER.info("Success to wirte File[" + pass + "]");
				}
			} catch (Exception e) {
				MGServerUtility.LOGGER.info("Failed to wirte File[" + pass + "]");
			}

			pw.close();

		} catch (IOException ex) {
			MGServerUtility.LOGGER.info("Failed to wirte File[" + pass + "]");
		}
	}

	public static void addWirteTextFile(String pass, String dec) {
		Set<String> set = new HashSet<String>();
		set.addAll(loadTextFile(pass));
		set.add(dec);
		set.remove("");
		wirteTextFile(pass, new ArrayList<String>(set));
		MGServerUtility.LOGGER.info("Failed to add File[" + pass + "] in String[" + dec + "]");
	}

	public static void arrangeTextFile(String pass) {
		Set<String> set = new HashSet<String>();
		set.addAll(loadTextFile(pass));
		set.remove("");
		wirteTextFile(pass, new ArrayList<String>(set));
		MGServerUtility.LOGGER.info("Failed to arrange File[" + pass + "]");
	}
}
