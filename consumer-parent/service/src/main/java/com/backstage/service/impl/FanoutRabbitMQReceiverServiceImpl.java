package com.backstage.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.backstage.service.FanoutRabbitMQReceiverService;
@Service
@RabbitListener(queues = "fanout.A")
public class FanoutRabbitMQReceiverServiceImpl implements FanoutRabbitMQReceiverService{
	Logger log =LoggerFactory.getLogger(getClass());
	@RabbitHandler
	@Override
	public void receive(String message) {
		log.info("fanout receive is "+message);
	}
}
