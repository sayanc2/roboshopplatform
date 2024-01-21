package com.org1.platform.roboshop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class RoboshopSwaggerConfig {

	@Value("${server.swagger.host}")
	private String host;
	@Value("${server.protocol}")
	private String protocol;
	@Value("${server.servlet.context-path}")
	private String context;

	private String applicationName = "Roboshop Platform";
	@Value("${server.swagger.host}")
	private String serverAddress;


	@Bean
	public OpenAPI customOpenAPI(@Value("${springdoc.version}") String apppVersion) {

		Server server = new Server();
		server.url(protocol.concat("://").concat(host).concat(context));

		return new OpenAPI()
				.components(null)
				.info(new Info()
						.title(applicationName)
						.version("v1.0")
						.description("Online platform for where robotics manufacturers can add related inventories and buyers can purchase them")
						.termsOfService("terms")
						.license(new License().name("L123").url(null)));


	}


}
