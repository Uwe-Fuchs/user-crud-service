package com.uwefuchs.demo.usercrud.server.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {

	@Test
	public void testBuildUser() {
		final Long id = Long.valueOf(1L);
		final String firstName = "firstName_1";
		final String lastName = "lastName_1";
		final String email = "test@email.com";
		final String userName = "myUserName";
		final String passWord = "secret";
		
		
		UserBuilder builder = new UserBuilder();
		builder.setId(id);
		builder.setFirstName(firstName);
		builder.setLastName(lastName);
		builder.setEmail(email);
		builder.setUsername(userName);
		builder.setPassword(passWord);
		
		User user = builder.build();

		assertEquals(user.getId(), id);
		assertEquals(user.getFirstName(), firstName);
		assertEquals(user.getLastName(), lastName);
		assertEquals(user.getEmail(), email);
		assertEquals(user.getUsername(), userName);
		assertEquals(user.getPassword(), passWord);
	}
}
