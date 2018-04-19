package com.backstage.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.backstage.service.DirectRabbitMQReceiverService;
@Service
@RabbitListener(queues = "rabbit")
public class DirectRabbitMQReceiverServiceImpl implements DirectRabbitMQReceiverService{
	Logger log =LoggerFactory.getLogger(getClass());
	@RabbitHandler
	@Override
	public void receive(String message) {
		log.info("direct receive is"+message);
	}

}
