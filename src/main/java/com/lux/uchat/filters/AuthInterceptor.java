package com.lux.uchat.filters;

import com.lux.uchat.domain.Users;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("ACCESS_TOKEN");
        if (token =="") {
            //throw new ExeResultException("无效token");
        }
        Users user = new Users();
        user.setCid(123456);
        user.setNickname("zhangsan");

        request.setAttribute("currentUser", user);

        return  true;
    }
}
