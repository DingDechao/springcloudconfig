package com.ddc.springcloudconfig.demospringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ConfigurationProperties(prefix = "example")
public class DemoSpringcloudApplication {

	private String property;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	@GetMapping("/helloworld")
	public String helloRest() {
		return getProperty();
		//return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringcloudApplication.class, args);
	}

}
