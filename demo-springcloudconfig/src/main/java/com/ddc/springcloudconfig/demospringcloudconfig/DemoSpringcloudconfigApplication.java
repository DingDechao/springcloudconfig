package com.ddc.springcloudconfig.demospringcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DemoSpringcloudconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringcloudconfigApplication.class, args);
	}

}
