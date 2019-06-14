package com.dy.unit.test;

import static org.junit.Assert.*;//静态引入后，以后的方法不需要再写类名

import static org.hamcrest.Matchers.*;//第二种测试方法
import org.junit.Test;

import com.dy.unit.T;
/**
 * 对Test的测试用例，
 * 使用hamcrest进行测试
 * @author dingy
 *
 */
public class TTest {

	@Test
	public void testAdd() {
		int result =new T().add(2,3);
		assertEquals(5, result);
	}
	
	@Test
	public void testDiv(){
		int result=new T().devide(8, 2);
		assertThat(4, is(4));
	}
	
	@Test
	public void testMul(){
		int result =new T().multi(2, 3);
		assertEquals(6,result);
	}
}
