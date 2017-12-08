package com.lzp.springSecurity.config;


/**
 * Created by edpzj on 2017/8/3.
 */

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WeChatInterceptor implements HandlerInterceptor {

    @Resource
    MyAuthenticationManager MyAuthenticationManager;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("在请求处理之前进行调用（Controller方法调用之前）" + request.getContextPath() + "  " + request.getRequestURI());
        String code = request.getParameter("code");
        Authentication authentication = new UsernamePasswordAuthenticationToken(code, "Credentials");
        Authentication result = MyAuthenticationManager.authenticate(authentication);
        //将授权Token存放到安全上下文.完成整个安全认证和授权步骤
        //在每一次request结束后都将清除当前线程的ThreadLocal,所以在没有特殊处理的情况下.当前拦截器后续部分不能获取到当前请求的授权信息
        SecurityContextHolder.getContext().setAuthentication(result);

        return true;// 只有返回true才会继续向下执行，返回false取消当前请求
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        System.out.println(userDetails.getUsername());
        System.out.println("请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        System.out.println(userDetails.getUsername());
        //删除SecurityContext中当前的授权信息
        System.out.println("在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
    }

}