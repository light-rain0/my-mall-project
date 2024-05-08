package com.cyh.mall.repository;

import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author cyh
 * @since 2024/5/8
 */
public class DataSourceTests {

    @Test
    public void getDataSource() throws SQLException {
        DataSource dataSource = MallProjectDataSource.getDataSource();
        assert dataSource != null;
        assert dataSource.getConnection() != null;
    }
}
