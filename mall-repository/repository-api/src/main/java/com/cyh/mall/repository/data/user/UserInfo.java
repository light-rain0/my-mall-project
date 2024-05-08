package com.cyh.mall.repository.data.user;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author cyh
 * @since 2024/5/9
 */
@Data
public class UserInfo {

    /**
     * 用户ID(必填)
     */
    private Long id;

    /**
     * 用户手机号(必填)
     */
    private String phoneNumber;

    /**
     * 用户姓名(必填)
     */
    private String username;

    /**
     * 登录密码密码(必填)
     */
    private String password;

    /**
     * 用户头像地址(必填)
     */
    private String userProfilePicture;

    /**
     * 创建时间(必填)
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间(必填)
     */
    private LocalDateTime updatedAt;
}
