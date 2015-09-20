package jp.co.smartservice.domain.common.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyHelper {

	@Value("${user.initPassword}")
	public String initPassword;

}
