package com.ll.testdatasource.common;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Create by ll on 2018/7/23.
 */

/**
 * 实现动态切换数据源抽象类
 * spring为我们提供了AbstractRoutingDataSource，即带路由的数据源。
 * 继承后我们需要实现它的determineCurrentLookupKey()，该方法用于自定义实际数据源名称的路由选择方法，
 * 由于我们将信息保存到了ThreadLocal中，所以只需要从中拿出来即可。
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceHolder.getDataSource();
    }
}
