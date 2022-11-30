package org.craftsman.restservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.craftsman.restservice.domain.mappers.RestServiceFactoryMapperImpl;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Configuration
public class RestServiceConfig {

	@Value("${restservice.msg}")
	private String msg;

	@Bean
	public OpenAPI customOpenAPI(@Value("${springdoc.api-docs.version}") String appVersion) {
		return new OpenAPI()
				.components(new Components().addSecuritySchemes("basicScheme",
						new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
				.info(new Info().title("RestService API").version(appVersion).description("This is a RestService Api.")
						.license(new License().name("Apache 2.0").url("https://opensource.org/licenses/Apache-2.0"))
						.contact(new Contact().url("http://cadb-craftsman.com").name("Craftsman")));
	}

	@Bean
	public RestServiceFactoryMapperImpl getFactoryMapper() {
		return new RestServiceFactoryMapperImpl();
	}
	
	@Bean
	public void getMessage() {
		log.warn("Properties value of: " + msg);
	}
}
