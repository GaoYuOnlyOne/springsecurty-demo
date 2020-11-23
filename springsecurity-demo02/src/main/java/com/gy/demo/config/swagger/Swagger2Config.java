package com.gy.demo.config.swagger;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;
@Configuration
@EnableSwagger2
@EnableAutoConfiguration
public class Swagger2Config {

    /**
     *
     * @return
     */
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //此处根据情况自行添加需要将哪些接口纳入Swagger 文档管理。此处应用basePackage管理，还可以利用注解管理
                //如果填写错误的话会出现“No operations defined in spec!” 的问题。
                .apis(RequestHandlerSelectors.basePackage("com.gy.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     *
     * @return
     */
    private ApiInfo apiInfo(){
        Contact contact = new Contact("Swagger2 demo", "http://localhost/8080", "1185844957@qq.com");
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTFUL API")
                .description("描述信息")
                .termsOfServiceUrl("http://localhost/8080")
                .version("1.0")
                .contact(contact)
                .build();
    }
}