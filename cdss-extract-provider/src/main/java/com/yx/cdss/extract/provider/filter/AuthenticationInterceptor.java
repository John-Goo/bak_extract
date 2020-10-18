package com.yx.cdss.extract.provider.filter;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AuthenticationInterceptor
 * @Desc: TODO
 * @history v1.0
 */
//@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Autowired
    private JwtValidator jwtValidator;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("handler>>>"+handler);
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        String header = request.getHeader("Authorisation");

        if (header == null || !header.startsWith("Token ")) {
            throw new RuntimeException("JWT Token is missing");
        }
        String token = header.substring(6);
        JwtUser jwtUser = jwtValidator.validate(token);

        if (jwtUser == null) {
            throw new RuntimeException("JWT Token is incorrect");
        }
        System.out.println("==用户信息："+JSONObject.fromObject(jwtUser).toString());
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        System.out.println(handlerMethod.getMethod().getName()+",");
        Method method = handlerMethod.getMethod();
        WAuth wAuth = handlerMethod.getMethod().getAnnotation(WAuth.class);
        WAuthEnum admin = wAuth.value();
        // 权限断言
        WAuthEnum requiredFlag = wAuth.required();
        if(admin.equals(WAuthEnum.ADMIN)){
            String role = WAuthEnum.ADMIN.toString();
            if(role.equalsIgnoreCase(jwtUser.getRole())){
                return true;
            }else {
                response.setHeader("Content-type", "text/html;charset=UTF-8");
                response.setCharacterEncoding("UTF-8");
                response.getWriter().write(">>您没有权限访问！");
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("=== postHandle ===");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
