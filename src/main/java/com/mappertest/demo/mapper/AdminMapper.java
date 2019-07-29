package com.mappertest.demo.mapper;

import com.mappertest.demo.pojo.UserInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AdminMapper extends Mapper<UserInfo> {
    List<UserInfo> findByUser(String name,String age);
}
