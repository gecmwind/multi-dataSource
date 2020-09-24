package com.cm.controller;

import com.cm.entity.UserInfo;
import com.cm.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author cm.g
 * @date 2020/9/24 16:27
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private IUserInfoService db1UserInfoService;
    @Autowired
    private IUserInfoService db2UserInfoService;
    @GetMapping("/get/{id}")
    @ResponseBody
    public UserInfo getUserInfo(@PathVariable Integer id) {
        UserInfo userInfo = db1UserInfoService.getById(id);
        return userInfo;
    }
}
