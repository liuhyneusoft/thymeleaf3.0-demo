package com.web.session;

import com.web.User;
import com.web.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/6/10.
 */
@Controller
@RequestMapping("/session")
public class SessionControl {

    @RequestMapping("s1")
    public String s1(HttpSession session){
        session.setAttribute("userinfo","hahaha");
        session.setAttribute("userObject",new UserEntity(4,"djlkds","8888","ddd"));
        return "/sessions/index";
    }

    public String getFromSpringBean(){
        return "go go go ";
    }

    public String getFromSpringBeanPram(String s){
        return "go go go " + s;
    }
}
