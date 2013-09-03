package br.jus.tre_pa.frameworkdemoiselle.query.filter.qualifiers;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.enums.OperationType;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ TYPE, METHOD, FIELD, PARAMETER })
public @interface Predicate {

	OperationType operation();

}
