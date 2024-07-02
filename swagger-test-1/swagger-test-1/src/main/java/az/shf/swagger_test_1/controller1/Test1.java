package az.shf.swagger_test_1.controller1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {
    @GetMapping
    public String test1() {
        return "test1";
    }
    @GetMapping("/2")
    public String test12() {
        return "test12";
    }
}
