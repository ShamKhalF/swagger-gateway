package az.shf.swagger_test_1.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Swagger Test 1 API")
                        .version("v1")
                        .description("This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3."));
    }
}