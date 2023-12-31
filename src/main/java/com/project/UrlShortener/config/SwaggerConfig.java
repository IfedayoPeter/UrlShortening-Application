package com.project.UrlShortener.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.project.UrlShortener.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaData());
    }
    public ApiInfo metaData(){
        ApiInfo apiInfo = new ApiInfo(
                "UrlShortener Application",
                "A url service application that reduces the length of urls",
                "1.0",
                "Terms of Service",
        new Contact("Ifedayo Peter", "https://github.com/IfedayoPeter/UrlShortening-Application/","awoniyiifedayopter@gmail.com"),
                "Null",
                "Null"
        );
        return apiInfo;
    }
}
