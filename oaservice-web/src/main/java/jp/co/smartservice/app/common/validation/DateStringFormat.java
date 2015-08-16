package jp.co.smartservice.app.common.validation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author bakuskjp
 *
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {DateStringFormatValidator.class })
public @interface DateStringFormat {

	String message() default "{jp.co.smartservice.app.common.validation.DateStringFormat.message}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

	String pattern() default "";

	@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
	@Retention(RUNTIME)
	@Documented
	@interface List {

		DateStringFormat[] value();
	}

}
