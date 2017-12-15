/**
 * 
 */
package com.entmobi.fnu.fnudocker;

import static org.junit.Assert.*;

import java.io.Console;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.entmobi.fnu.fnudocker.resource.credentials;
import com.entmobi.fnu.fnudocker.resource.login;


@RunWith(SpringRunner.class)
@WebMvcTest(login.class)
@SpringBootTest

/**
 * @author tekreliance
 *
 */
public class login_test {

	/**
	 * @throws java.lang.Exception
	 */
	@Autowired
    private login mvc;
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		System.out.println("TEst Started");
		//fail("Not yet implemented");
		credentials c = new credentials();
		c.setPassword("123");
		c.setUsername("admin");
		boolean result = false;//mvc.Authenticate(c);
		
		assertTrue("Successfully authenticated with test data", result);
	}

}
