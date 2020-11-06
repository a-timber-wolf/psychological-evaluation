package com.example.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author EMD-WangEnGui
 * @date 11/06 11:30
 */
@Component
public class TokenFilter extends ZuulFilter {

    /**
     * 过滤器类型
     * pre表示在請求之前进行逻辑操作
     * @return 过滤器类型
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行顺序
     * 当一个請求在同一个阶段存在多个过滤器时，过滤器的执行顺序
     * @return 过滤器执行顺序
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否开启过滤
     * @return 开启过滤
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 编写过滤器拦截业务逻辑代码
     * 校验客户端发来的请求token是否为空，为空就不能通过，返回token is null
     * @return 业务逻辑
     */
    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getParameter("token");
        if (token == null) {
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseBody("token is null");
            currentContext.setResponseStatusCode(401);
        }
        return null;
    }
}
