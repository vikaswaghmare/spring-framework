package com.springcore.SpringEventHandling;

import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class CustomAccountEvent extends ApplicationEvent {
	private String message;

	public CustomAccountEvent(Object obj, String message) {
		super(obj);
		this.message = message;
	}

	static FileOutputStream fos;
	static {
		try {
			fos = new FileOutputStream("D:/logs/log.txt", true);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public void generateLog() {
		// System.out.println("********"+message+"*******");
		try {
			message = new Date().toString() + ":" + message;
			message = message + "\n";
			byte[] b = message.getBytes();
			fos.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
