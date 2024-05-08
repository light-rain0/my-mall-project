package com.cyh.mall.repository;

/**
 * 实现类为找到异常
 *
 * @author cyh
 * @since 2024/5/8
 */
public class ImplNotFoundException extends RuntimeException {

    public ImplNotFoundException(Class<?> clazz) {
        super("实现类: " + clazz + " 未找到");
    }
}
