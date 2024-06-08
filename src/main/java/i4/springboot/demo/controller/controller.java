package i4.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping("/")
    public String index() {
        return "Welcome To Spring Boot Applicaton";
    }
}
