package com.morimori.mgserverutility.client.pcsystem;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;

import com.morimori.mgserverutility.MGServerUtility;

public class ClientFileLoader {
	public static void DownloadPictuer(String DpassIn, String nameIn) {
		try {
			URL url = new URL(DpassIn);
			URLConnection conn = url.openConnection();
			BufferedImage bi = null;
			File file = new File(nameIn);

			bi = ImageIO.read(conn.getInputStream());
			ImageIO.write(bi, "png", file);
			MGServerUtility.LOGGER
					.info("Success to Download Pictuer[" + DpassIn + "] in Save[" + nameIn + "]");
		} catch (MalformedURLException e) {
			MGServerUtility.LOGGER
					.info("Failed to Download Pictuer[" + DpassIn + "] in Save[" + nameIn + "]");
		} catch (IOException e) {
			MGServerUtility.LOGGER
					.info("Failed to Download Pictuer[" + DpassIn + "] in Save[" + nameIn + "]");
		}
	}

	public static boolean isFileExists(String passIn) {
		File file = new File(passIn);
		return file.exists();
	}
}
