package com.springcore.SpringEventHandling;

import org.springframework.context.ApplicationListener;

public class CustomAccountEventHandler  implements ApplicationListener<CustomAccountEvent> {
	public void onApplicationEvent(CustomAccountEvent e) {
		 e.generateLog();
		 }
}
