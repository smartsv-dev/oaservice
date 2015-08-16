package jp.co.smartservice.app.common.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.joda.time.format.DateTimeFormat;

import jp.co.smartservice.domain.common.constants.Constants;

/**
 * @author bakuskjp
 *
 */
public class DateStringFormatValidator implements ConstraintValidator<DateStringFormat, String> {

	private String pattern;

	@Override
	public void initialize(DateStringFormat constraintAnnotation) {
		this.pattern = constraintAnnotation.pattern();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (value == null || Constants.STR_EMPTY.equals(value.trim())) {
			return true;
		}
		try {
			DateTimeFormat.forPattern(pattern).parseDateTime(value);
		} catch (IllegalArgumentException e) {
			return false;
		} catch (UnsupportedOperationException e) {
			return false;
		}
		return true;
	}

}
