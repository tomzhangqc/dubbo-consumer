package com.backstage.service;

public interface FanoutRabbitMQReceiverService {
	public void receive(String message);
}
