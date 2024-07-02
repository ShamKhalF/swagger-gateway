package az.shf.swagger_test_2.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2 {
    @GetMapping
    public String test2() {
        return "test2";
    }
}
