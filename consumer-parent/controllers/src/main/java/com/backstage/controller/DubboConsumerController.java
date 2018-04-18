package com.backstage.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backstage.service.DubboConsumerService;

@RestController
public class DubboConsumerController {
	@Resource(name="dubboConsumerServiceImpl")
	DubboConsumerService dubboConsumerServiceImpl;
	private Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping("/consumer")
	public void consumer() {
		logger.info("请求进来了");
		dubboConsumerServiceImpl.consumer();
	}
}
