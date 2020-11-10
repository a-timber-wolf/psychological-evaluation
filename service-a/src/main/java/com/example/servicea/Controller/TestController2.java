package com.example.servicea.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EMD-WangEnGui
 * @date 11/09 13:21
 */
@RestController
@RefreshScope
public class TestController2 {
    @Value("${name}")
    private String name;

    @RequestMapping("/hi")
    String hi() {
        return name;
    }
}
