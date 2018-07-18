package com.haoze.controller.demo;

import com.haoze.utils.MD5Util;
import com.haoze.utils.ResponseResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hp on 2018/7/18.
 */
@Controller
@RequestMapping("/login")
public class LoginController {


}
