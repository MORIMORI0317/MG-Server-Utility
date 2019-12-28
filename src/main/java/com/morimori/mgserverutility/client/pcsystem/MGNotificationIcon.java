package com.morimori.mgserverutility.client.pcsystem;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import com.morimori.mgserverutility.config.MGConfig;

import net.minecraft.client.Minecraft;

public class MGNotificationIcon {
	public static TrayIcon Tray;
	public static PopupMenu popup;

	public static void main() {
		if (!ClientFileLoader.isFileExists("tray_icon.png")) {
			ClientFileLoader.DownloadPictuer(
					MGConfig.TrayIconURL,
					"tray_icon.png");
		}

		MGNotificationIcon app = new MGNotificationIcon();
		app.run();

	}

	private void run() {
		popup = new PopupMenu();

		MenuItem ExitMenu = new MenuItem("Test");
		ExitMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Tray.displayMessage("テスト", "FPS=" + Minecraft.getDebugFPS(), MessageType.INFO);
			}
		});
		popup.add(ExitMenu);

		ImageIcon icona = new ImageIcon(MGConfig.TrayIconName);
		Image image = icona.getImage();
		Tray = new TrayIcon(image, "Minecraft SCP Server Client", popup);
		Tray.setImageAutoSize(true);

		try {
			SystemTray.getSystemTray().add(Tray);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		//Tray.displayMessage("通知について", "通知をオフにしたければコンフィグでオフにしてください。", MessageType.INFO);
	}
}
