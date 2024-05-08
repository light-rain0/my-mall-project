package com.cyh.mall.repository;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * jdbc工具
 *
 * @author cyh
 * @since 2024/5/9
 */
public class JdbcSupport {

    /**
     * 获取jdbc执行器客户端封装
     */
    private static final JdbcClient JDBC_CLIENT = JdbcClient.create(MallProjectDataSource.getDataSource());

    /**
     * jdbc事务处理器
     */
    private static final TransactionTemplate TRANSACTION_TEMPLATE;

    static {
        // 获取jdbc 事务管理器
        PlatformTransactionManager transactionManager = new JdbcTransactionManager(MallProjectDataSource.getDataSource());
        TRANSACTION_TEMPLATE = new TransactionTemplate(transactionManager);
    }

    /**
     * 获取jdbc执行器
     */
    public static JdbcClient jdbcClient() {
        return JDBC_CLIENT;
    }

    /**
     * 获取jdbc事务管理器
     */
    public static TransactionTemplate transactionTemplate() {
        return TRANSACTION_TEMPLATE;
    }
}
