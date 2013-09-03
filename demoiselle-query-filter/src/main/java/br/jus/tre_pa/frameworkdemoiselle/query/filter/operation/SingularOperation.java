package br.jus.tre_pa.frameworkdemoiselle.query.filter.operation;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public interface SingularOperation<X> {
	public <T> Predicate execute(CriteriaBuilder cb, Root<T> p, String field, X value);
}
