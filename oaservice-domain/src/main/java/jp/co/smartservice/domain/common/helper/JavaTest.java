package jp.co.smartservice.domain.common.helper;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class JavaTest {

	public static void main(String[] args) {

		StandardPasswordEncoder encoder = new StandardPasswordEncoder();
		String rawPassword = "test";
		String encodedPassword = encoder.encode(rawPassword);
		boolean isEquals = encoder.matches(rawPassword, encodedPassword);

		System.out.println(isEquals);
		System.out.println(encodedPassword);

		String value = "20150601";
		System.out.println(value.replaceAll("[/\\-]", ""));

	}

}
