package br.jus.tre_pa.frameworkdemoiselle.query.filter.core.operations;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public interface SingularOperation {
	public <T, X> Predicate execute(CriteriaBuilder cb, Root<T> p, String field, X value);
}
