package br.jus.tre_pa.frameworkdemoiselle.query.filter.annotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.inject.Stereotype;
import javax.inject.Named;

import br.gov.frameworkdemoiselle.annotation.ViewScoped;

@Inherited
@Named
@ViewScoped
@Target({ TYPE })
@Retention(RUNTIME)
@Stereotype
public @interface QueryFilter {

}
