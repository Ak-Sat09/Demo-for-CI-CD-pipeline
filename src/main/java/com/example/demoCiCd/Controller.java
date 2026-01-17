package com.example.demoCiCd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
    public String testApi() {
        return "Test case 1"; // ✅ response
    }
}
