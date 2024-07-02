package az.shf.swggateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SwgGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwgGatewayApplication.class, args);
    }

}
