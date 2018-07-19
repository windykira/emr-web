package com.haoze.controller.demo;

import com.alibaba.fastjson.JSONObject;
import com.haoze.utils.MD5Util;
import com.haoze.utils.ResponseResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hp on 2018/7/18.
 */
@Controller
@RequestMapping("/api")
public class LoginController {

    @GetMapping({ "/", "" ,"/login"})
    String login(Model model) {
        return "login";
    }

    @GetMapping("/sucess")
    String sucess(Model model) {
        return "sucess";
    }

    @PostMapping("/login")
    @ResponseBody
    String userLogin(String username, String password) {

        JSONObject jsonObject = new JSONObject();
        password = com.haoze.config.MD5Util.encrypt(username, password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            jsonObject.put("token", subject.getSession().getId());
            jsonObject.put("msg", "登录成功");
            //CurrentUser.setCurrentUserDepartment(departmentId);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
        return jsonObject.toJSONString();
    }
}
