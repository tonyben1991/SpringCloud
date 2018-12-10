package tech.tonyben1991.invoker;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class IndexController {

    @GetMapping("/getInvoker")
    public String invoker() {
        return getRestTemplate().getForObject("http://server/getProvider", String.class) + ":invoker";
    }

    @Bean   //将该对象注册到Spring IOC容器中
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
