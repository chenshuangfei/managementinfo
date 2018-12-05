package com.chen.controller;

import com.chen.entity.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServlet;
import java.util.List;

@Controller
public class LoginController extends HttpServlet {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/goLoginServlet")
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/doLoginServlet")
    public String doLoginServlet(User user){
        User u = userService.queryUser(user);

        return "login";
    }
}
