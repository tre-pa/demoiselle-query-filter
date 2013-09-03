package br.jus.tre_pa.frameworkdemoiselle.query.filter.operations;

import java.util.Collection;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.operation.SingularOperation;

public class IsMemberOperation<X> implements SingularOperation<X> {

	@Override
	public <T> Predicate execute(CriteriaBuilder cb, Root<T> p, String field, X value) {
		return cb.isMember(value, p.<Collection<X>>get(field));
	}

}
