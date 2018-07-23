package com.ll.testdatasource.common;

/**
 * Create by ll on 2018/7/23.
 */

/**
 * 创建线程共享工具
 * 由于我们的数据源信息要保证在同一线程下切换后不要被其他线程修改，所以我们将数据源信息保存在ThreadLocal共享中。
 */
public class DynamicDataSourceHolder {
    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static void putDataSource(String name) {
        THREAD_LOCAL.set(name);
    }

    public static String getDataSource() {
        return THREAD_LOCAL.get();
    }

    public static void removeDataSource() {
        THREAD_LOCAL.remove();
    }
}
