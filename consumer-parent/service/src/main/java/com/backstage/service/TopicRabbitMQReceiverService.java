package com.backstage.service;

public interface TopicRabbitMQReceiverService {
	public void receive(String message);
}
