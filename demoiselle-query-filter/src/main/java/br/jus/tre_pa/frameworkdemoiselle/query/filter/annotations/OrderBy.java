package br.jus.tre_pa.frameworkdemoiselle.query.filter.annotations;

import static java.lang.annotation.ElementType.CONSTRUCTOR;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(CONSTRUCTOR)
public @interface OrderBy {
	String[] asc() default {};

	String[] desc() default {};
}
