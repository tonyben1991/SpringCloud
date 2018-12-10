package tech.tonyben1991.invoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientInvokerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientInvokerApplication.class, args);
    }
}
