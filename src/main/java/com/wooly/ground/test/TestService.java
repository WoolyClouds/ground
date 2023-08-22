package com.wooly.ground.test;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public void test01() {
		TestRecord tr = new TestRecord("name", 10);
		System.out.println(tr.name());
		System.out.println(tr.age());
	}



}
