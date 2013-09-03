package br.jus.tre_pa.frameworkdemoiselle.query.filter.operations;

import java.util.Collection;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.operation.ListOperation;

public class NotInOperation<X> implements ListOperation<X> {

	@Override
	public <T> Predicate execute(CriteriaBuilder cb, Root<T> p, String field, Collection<X> values) {
		return cb.not(p.in(values));
	}

}
