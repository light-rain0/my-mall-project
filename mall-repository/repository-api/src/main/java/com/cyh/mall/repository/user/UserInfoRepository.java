package com.cyh.mall.repository.user;

import com.cyh.mall.repository.ServiceLoaderUtil;
import com.cyh.mall.repository.data.user.UserInfo;

import java.util.Optional;

/**
 * 用户相关存储操作
 *
 * @author cyh
 * @since 2024/5/9
 */
public interface UserInfoRepository {

    UserInfoRepository INSTANCE = ServiceLoaderUtil.find(UserInfoRepository.class);

    int insert(UserInfo userInfo);

    /**
     * 根据用户名和密码查询一条数据
     *
     * @param userName 用户名
     * @param password 用户密码
     * @return
     */
    Optional<UserInfo> findByUsernameAndPassword(String userName, String password);
}
