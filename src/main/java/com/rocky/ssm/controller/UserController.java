package com.rocky.ssm.controller;

import com.rocky.ssm.model.User;
import com.rocky.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Rocky on 2017-12-19.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value="/{userId}",method= RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("userId") Integer userId){
        User user = userService.getUser(userId);
        return user;
    }
}
