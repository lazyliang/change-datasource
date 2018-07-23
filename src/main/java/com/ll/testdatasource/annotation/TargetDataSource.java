package com.ll.testdatasource.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Create by ll on 2018/7/23.
 */

/**
 * 定义一个注解用于切换数据源
 * 我们切换数据源时，一般都是在调用mapper接口的方法前实现，所以我们定义一个方法注解，
 * 当AOP检测到方法上有该注解时，根据注解中value对应的名称进行切换。
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TargetDataSource {
    String value();
}
