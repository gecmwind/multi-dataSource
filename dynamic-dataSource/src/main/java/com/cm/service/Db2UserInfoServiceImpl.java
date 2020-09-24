package com.cm.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cm.entity.UserInfo;
import com.cm.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
 * @author cm.g
 * @date 2020/9/24 16:21
 * @Description:
 */
@Service("db2UserInfoService")
@DS("db2")
public class Db2UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {
}
