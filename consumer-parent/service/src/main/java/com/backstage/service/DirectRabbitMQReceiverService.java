package com.backstage.service;

public interface DirectRabbitMQReceiverService {
	public void receive(String message);
}
