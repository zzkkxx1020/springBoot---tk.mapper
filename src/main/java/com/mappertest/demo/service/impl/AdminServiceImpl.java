package com.mappertest.demo.service.impl;

import com.mappertest.demo.dao.AdminInterface;
import com.mappertest.demo.mapper.AdminMapper;
import com.mappertest.demo.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminInterface {

    @Autowired
    private AdminMapper adminService;

    @Override
    public List<UserInfo> findUser() {
        List<UserInfo> adminInfos = adminService.selectAll();
        return adminInfos;
    }

    @Override
    public List<UserInfo> findByUserOne(String name, String age) {
        List<UserInfo> byUser = adminService.findByUser(name, age);
        return byUser;
    }

}
