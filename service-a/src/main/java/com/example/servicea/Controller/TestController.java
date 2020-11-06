package com.example.servicea.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EMD-WangEnGui
 * @date 11/05 15:17
 */
@Slf4j
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    String fallback() {
        return "服务器繁忙";
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("/hello")
    public String sayHello() {

        System.out.println("threadName:" + Thread.currentThread().getName());

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            System.out.println("catch");
//            log.info(e.getMessage(),e);
//        }

        return "Hello world " + "端口：" + port;
    }

    @RequestMapping("/otherService")
    public String otherService() {
        return "我是其他服务";
    }



}
