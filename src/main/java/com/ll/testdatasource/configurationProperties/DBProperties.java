package com.ll.testdatasource.configurationProperties;

import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Create by ll on 2018/7/23.
 */

/**
 * 定义多个数据源
 * 之前我们假设中访问两个库两个表，假设test库数据源我们命名为test1，test2库数据源我们命名为test2。
 */
@Component
@Data
@ConfigurationProperties(prefix = "hikari")
public class DBProperties {
    private HikariDataSource test1;
    private HikariDataSource test2;

    public HikariDataSource getTest1() {
        return test1;
    }

    public void setTest1(HikariDataSource test1) {
        this.test1 = test1;
    }

    public HikariDataSource getTest2() {
        return test2;
    }

    public void setTest2(HikariDataSource test2) {
        this.test2 = test2;
    }
}
