package com.mappertest.demo.dao;

import com.mappertest.demo.pojo.UserInfo;

import java.util.List;

public interface AdminInterface {
    List<UserInfo> findUser();
    List<UserInfo> findByUserOne(String name, String age);
}
