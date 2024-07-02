package az.shf.swagger_test_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SwaggerTest1Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerTest1Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SwaggerTest1Application.class);
	}
}
