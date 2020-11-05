package com.example.servicea.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EMD-WangEnGui
 * @date 11/05 15:17
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello world!";
    }

}
