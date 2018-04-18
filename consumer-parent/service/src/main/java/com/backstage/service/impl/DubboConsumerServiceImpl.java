package com.backstage.service.impl;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.backstage.service.DubboConsumerService;
import com.forum.service.DubboProviderService;

@Service
public class DubboConsumerServiceImpl implements DubboConsumerService {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Resource
	DubboProviderService dubboProviderService;
	@Override
    public void consumer() {
		logger.info("消费方被调用了");
		dubboProviderService.provider();
    }
}
