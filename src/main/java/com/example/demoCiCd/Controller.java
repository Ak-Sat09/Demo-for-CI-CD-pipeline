package com.example.demoCiCd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
    public String testApi() {
        return "Test case 1"; // ✅ response
    }

    @GetMapping("/test2")
    public String testApi2() {
        return "Test case 2"; // ✅ response
    }

    @GetMapping("/test3")
    public String testApi3() {
        return "Test case 3"; // ✅ response
    }
}
