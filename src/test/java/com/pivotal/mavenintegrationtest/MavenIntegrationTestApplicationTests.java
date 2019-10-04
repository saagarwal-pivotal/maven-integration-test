package com.pivotal.mavenintegrationtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MavenIntegrationTestApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("<<<<<<<<< Unit Test >>>>>>>>>");
	}

}
