package com.cyh.mall.repository;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

/**
 * 商城项目的数据源
 *
 * @author cyh
 * @since 2024/5/8
 */
public class MallProjectDataSource {

    private static final DataSource DATA_SOURCE;

    static {
        // 加载数据源配置
        final HikariConfig hikariConfig = new HikariConfig("/hikari_datasource_config.properties");
        DATA_SOURCE = new HikariDataSource(hikariConfig);
    }

    private MallProjectDataSource() {
    }

    public static DataSource getDataSource() {
        return DATA_SOURCE;
    }
}
