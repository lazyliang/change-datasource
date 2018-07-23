package com.ll.testdatasource;

import com.ll.testdatasource.mapper.UserInfoMapper;
import com.ll.testdatasource.model.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDatasourceApplicationTests {

	@Autowired
	private UserInfoMapper userInfoMapper;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testDynamicDatasource() {
		UserInfo userInfo;
		for (int i = 1; i <= 1; i++) {
			//i为奇数时调用selectByOddUserId方法获取，i为偶数时调用selectByEvenUserId方法获取
			userInfo = i % 2 == 1 ? userInfoMapper.selectByOddUserId(i) : userInfoMapper.selectByEvenUserId(i);
//			log.info("{}->={}", userInfo.getId(),userInfo.getRemarks());
		}
	}
}
