package ex03;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ex03.component.MyComponent;

/**
 *	SpringBoot Test Integration
 * 
 */

@SpringBootTest
public class MyApplicationTest {
	@Autowired
	MyComponent myComponent;
	
	@Test
	public void testMyComponentNoNull() {
		assertNotNull(myComponent);
	}
}