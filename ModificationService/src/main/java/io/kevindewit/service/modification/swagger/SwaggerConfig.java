package io.kevindewit.service.modification.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("io.kevindewit.service.modification"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .tags(
                        new Tag("System",
                                "Operations available to systems"),
                        new Tag("Admin",
                                "Operations available to admins"),
                        new Tag("Developer",
                                "Operations available to developers")
                )
                ;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("REST API")
                .description("Some custom description of API.")
                .termsOfServiceUrl("API TOS")
                .license("License of API")
                .licenseUrl("API license URL")
                .version("0.0.1")
                .build()
                ;
    }
}
