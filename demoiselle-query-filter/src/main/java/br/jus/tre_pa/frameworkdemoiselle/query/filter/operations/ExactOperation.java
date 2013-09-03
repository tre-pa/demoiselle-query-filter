package br.jus.tre_pa.frameworkdemoiselle.query.filter.operations;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.jus.tre_pa.frameworkdemoiselle.query.filter.operation.SingularOperation;

public class ExactOperation implements SingularOperation<String> {

	@Override
	public <T> Predicate execute(CriteriaBuilder cb, Root<T> p, String field, String value) {
		return cb.like(p.<String>get(field), value);
	}

}
