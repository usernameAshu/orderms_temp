package com.edureka.orderms.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableEurekaClient
/*@EnableSwagger2WebMvc
@Import(SpringDataRestConfiguration.class)*/
public class SwaggerConfig {

/*	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	} */
	
}
