package br.jus.tre_pa.frameworkdemoiselle.query.filter.core.operations;

import java.util.Collection;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public interface ListOperation {
	public <T, X extends Collection<?>> Predicate execute(CriteriaBuilder cb, Root<T> p, String field, X value);

}
