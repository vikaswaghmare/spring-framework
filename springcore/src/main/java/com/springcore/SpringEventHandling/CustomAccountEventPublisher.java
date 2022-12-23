package com.springcore.SpringEventHandling;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomAccountEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publish(String message) {

		CustomAccountEvent ae = new CustomAccountEvent(this, message);
		publisher.publishEvent(ae);
	}
}
