package br.jus.tre_pa.frameworkdemoiselle.query.filter.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.enums.OperationType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Predicate {
	String field();

	OperationType operation();

	boolean caseInsensitive() default false;
}
