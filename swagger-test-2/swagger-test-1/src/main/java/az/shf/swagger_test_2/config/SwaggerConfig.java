//package az.shf.swagger_test_1.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@EnableSwagger2
//@Configuration
//public class SwaggerConfig {
//
//    public static final String AUTHORIZATION_HEADER = "Authorization";
//
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("az.shf.swagger_test_1.controller2"))
//                .paths(PathSelectors.any())
//                .build().apiInfo(apiInfoMetaData());
//    }
//
//
//    private ApiInfo apiInfoMetaData() {
//
//        return new ApiInfoBuilder().title("API Documentation")
//                .description("Describing the purpose of the API")
//                .license("Apache 2.0")
//                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//                .version("1.0.0")
//                .build();
//    }
//
//}