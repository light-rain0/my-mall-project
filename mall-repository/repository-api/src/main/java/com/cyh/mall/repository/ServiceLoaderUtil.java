package com.cyh.mall.repository;

import java.util.ServiceLoader;

/**
 * @author cyh
 * @since 2024/5/8
 */
public class ServiceLoaderUtil {

    /**
     * 查找一个实现
     * @param targetclass 查找实现类型
     * @return <T></>
     * @param <T> 找到的实例
     */
    public static <T> T find(Class<T> targetclass){

        return ServiceLoader.load(targetclass)
                .findFirst()
                .orElseThrow(() -> new ImplNotFoundException(targetclass));
    }
}
