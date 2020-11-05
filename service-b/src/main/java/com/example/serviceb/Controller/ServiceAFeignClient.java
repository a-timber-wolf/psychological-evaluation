package com.example.serviceb.Controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author EMD-WangEnGui
 * @date 11/05 16:24
 */
@FeignClient("SERVICE-A")
public interface ServiceAFeignClient {
    /**
     * 调用服务
     * @author EMD-WANGENGUI
     * @date 2020/11/05 16:29
     * @return hello
     */
    @RequestMapping("/hello")
    String hello();
}
