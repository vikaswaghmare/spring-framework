package com.springcore.SpringEventHandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedListenerImpl implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Application Context starded..!");
		
	}

}
