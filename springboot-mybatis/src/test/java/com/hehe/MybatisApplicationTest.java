package com.hehe;

import com.hehe.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTest {

	@SuppressWarnings("all")
	@Autowired
	UserMapper userMapper;

	@Test
	public void test_db() {

		//开始进行测试
		//查询集合大于0
		assertThat(userMapper.list().size()).isGreaterThan(1);
		//userId = 1 查询结果不为null
		assertThat(userMapper.getOne("1")).isNotEqualTo(null);
		//userId = xxx 查询结果为null
		assertThat(userMapper.getOne("xxx")).isEqualTo(null);



	}

}
