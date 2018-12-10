package tech.tonyben1991.provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProviderApplication {

    public static void main(String[] args) {
        System.out.println("please insert port:");
        int port = new Scanner(System.in).nextInt();
        new SpringApplicationBuilder(EurekaClientProviderApplication.class)
                .properties("server.port=" + port).run(args);
    }
}
