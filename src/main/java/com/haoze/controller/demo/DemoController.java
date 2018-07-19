package com.haoze.controller.demo;

import com.haoze.model.demo.DemoEntity;
import com.haoze.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hp on 2018/7/18.
 */
@Controller
@RequestMapping("/api/demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/list")
    @ResponseBody
    List<DemoEntity> list(){
        return demoService.list();
    }

}
