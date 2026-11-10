package com.rhs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Knife4j/Swagger 配置类
 * 访问地址：http://localhost:8080/doc.html
 */
@Configuration
public class SwaggerConfig {

    /**
     * 默认分组 - 全部接口
     */
    @Bean
    public Docket defaultApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("全部接口")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rhs.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 用户模块分组
     */
    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("用户模块")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rhs.controller"))
                .paths(PathSelectors.ant("/user/**"))
                .build();
    }

    /**
     * 系统模块分组
     */
    @Bean
    public Docket systemApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("系统模块")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rhs.controller"))
                .paths(PathSelectors.ant("/system/**"))
                .build();
    }

    /**
     * 配置文档基本信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Aran-接口文档")
                .description("Aran-接口文档")
                .contact(new Contact("Aran", "", "1111111111@qq.com"))
                .version("1.0.0")
                .build();
    }
}
