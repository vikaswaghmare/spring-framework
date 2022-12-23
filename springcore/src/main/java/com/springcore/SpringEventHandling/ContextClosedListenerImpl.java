package com.springcore.SpringEventHandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextClosedListenerImpl implements ApplicationListener<ContextClosedEvent>{

	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("Application Context Closed...!");
	}

}
