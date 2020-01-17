package dennis.chou.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloServiceTest {
    @Autowired
    HelloService service;

    @Test
    public void test() {
        assertEquals("Hello World", service.hello());
    }
}
