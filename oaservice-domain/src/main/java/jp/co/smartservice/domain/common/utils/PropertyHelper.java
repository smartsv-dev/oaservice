package jp.co.smartservice.domain.common.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyHelper {

	@Value("${user.ininPassword}")
	private String initPassword;

	public String getInitPassword() {
		return this.initPassword;
	}

}
