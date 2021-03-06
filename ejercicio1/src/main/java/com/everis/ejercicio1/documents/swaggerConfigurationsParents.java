package com.everis.ejercicio1.documents;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class swaggerConfigurationsParents {

	 @Bean
	    public Docket usersApi() {

	        return new Docket(DocumentationType.SWAGGER_2)

	                .apiInfo(usersApiInfo())

	                .select()

	                .paths(userPaths())

	                .apis(RequestHandlerSelectors.basePackage("com.everis.ejercicio1.documents.swaggerConfigurationsParents"))

	                .build()

	                .useDefaultResponseMessages(false);

	    }


	   private ApiInfo usersApiInfo() {

	        return new ApiInfoBuilder()

	                .title("Service Parents")

	                .version("1.0")

	                .license("Apache License Version 2.0")

	                .build();

	    }
	   
	   private Predicate<String> userPaths() {

	       return regex("/api/v1/parents.*");

	   }

}
