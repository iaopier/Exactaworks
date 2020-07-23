/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exactaapi.gastos;


import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static springfox.documentation.builders.PathSelectors.regex;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.VendorExtension;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;




/**
 *
 * @author Piercarlo
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket gastosAPI(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.exactaapi.gastos"))
                .paths(regex("/api/v1/gastos.*"))
                .build()
                .apiInfo(metaInfo());
    }
    
    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Gastos API REST",
                "API REST de cadastro de gastos",
                "1.0",
                "Terms of Service",
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>().toString()
        );

        return apiInfo;
    }
}