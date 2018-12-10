package tech.tonyben1991.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/getProvider")
    public String provider(){
        System.out.println(1);
        return "provider" ;
    }
}
