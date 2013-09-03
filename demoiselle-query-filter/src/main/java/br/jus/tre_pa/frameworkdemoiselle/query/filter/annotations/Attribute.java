package br.jus.tre_pa.frameworkdemoiselle.query.filter.annotations;

import static java.lang.annotation.ElementType.FIELD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(FIELD)
public @interface Attribute {
	String name();

	boolean mapped() default false;
}
