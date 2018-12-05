package com.chen.controller;

import com.chen.entity.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "haha")
public class MinController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/chen", method = RequestMethod.GET)

    public String chen() {

        System.out.print("hello");
        return "feifei";
    }

    @RequestMapping("/lala")
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView("feifei");
        User user = userService.selectUserById(1);
        mav.addObject("user", user);
        return mav;
    }
    @RequestMapping(value = "/houmin", method = RequestMethod.GET)

    public String houmin() {

        System.out.print("hello");
        return "chen/houmin";
    }

}
