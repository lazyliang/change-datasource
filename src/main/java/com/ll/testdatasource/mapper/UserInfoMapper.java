package com.ll.testdatasource.mapper;

import com.ll.testdatasource.annotation.TargetDataSource;
import com.ll.testdatasource.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


/**
 * Create by ll on 2018/7/23.
 */

/**
 * 由于我们的动态数据源配置了默认库，所以如果mapper方法是操作默认库的可以不需要注解，如果要操作非默认数据源，
 * 我们需要在方法上添加@TargetDataSource("数据源名称")注解。
 * 两个方法selectByOddUserId我们定义为奇数Id从test1库获取数据，
 * selectByEvenUserId定义为偶数Id从test2库获取数据，
 */
@Mapper
public interface UserInfoMapper {
    @Select("select * from user where id = #{id}")
   UserInfo selectByOddUserId(int id);

    @Select("select * from user where id = #{id}")
   @TargetDataSource("test2")
   UserInfo selectByEvenUserId(int id);
}
