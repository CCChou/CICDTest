package dennis.chou.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
