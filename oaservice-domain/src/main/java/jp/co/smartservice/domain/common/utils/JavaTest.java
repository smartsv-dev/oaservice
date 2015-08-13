package jp.co.smartservice.domain.common.utils;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class JavaTest {

	public static void main(String[] args) {

		StandardPasswordEncoder encoder = new StandardPasswordEncoder();
		String rawPassword = "test";
		String encodedPassword = encoder.encode(rawPassword);
		boolean isEquals = encoder.matches(rawPassword, encodedPassword);

		System.out.println(isEquals);
		System.out.println(encodedPassword);

	}

}