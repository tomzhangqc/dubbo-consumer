package com.backstage.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:config/dubbo-consumer.xml"})
public class DubboConfig {
	
}
