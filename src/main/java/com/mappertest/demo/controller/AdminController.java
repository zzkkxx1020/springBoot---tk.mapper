package com.mappertest.demo.controller;

import com.mappertest.demo.pojo.UserInfo;
import com.mappertest.demo.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("index")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;

    @RequestMapping("/user")
    @ResponseBody
    public List<UserInfo> selectInfo(){
        List<UserInfo> user = adminService.findUser();
        return user;
    }

    @RequestMapping("/getByUser")
    @ResponseBody
    public List<UserInfo> selectInfo(String name, String age){
        List<UserInfo> user = adminService.findByUserOne(name,age);
        return user;
    }

}
