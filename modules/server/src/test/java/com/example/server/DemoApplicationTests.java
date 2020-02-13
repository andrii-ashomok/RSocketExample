package com.example.server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {

		int n = 234;
		int sum = 0;
		for (char ch : String.valueOf(n).toCharArray()) {
			sum += Character.getNumericValue(ch);
		}
		AssertionErrors.assertEquals("Nope!" , 7, 16);
	}

}
