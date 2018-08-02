package com.tsiry.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.tsiry.org.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({ FileStorageProperties.class }) // To enable the
																// ConfigurationProperties
																// feature, we
																// need to add
																// @EnableConfigurationProperties
																// annotation to
																// any
																// configuration
																// class.
public class MultipartFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipartFormApplication.class, args);
	}
}
