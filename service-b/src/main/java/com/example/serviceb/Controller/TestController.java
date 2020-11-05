package com.example.serviceb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EMD-WangEnGui
 * @date 11/05 16:33
 */
@RestController
public class TestController {

    private final ServiceAFeignClient serviceAFeignClient;

    public TestController(ServiceAFeignClient serviceAFeignClient) {
        this.serviceAFeignClient = serviceAFeignClient;
    }

    @RequestMapping("/call")
    public String call() {
        String result = serviceAFeignClient.hello();
        return "b to a 访问结果：" + result;
    }

}
